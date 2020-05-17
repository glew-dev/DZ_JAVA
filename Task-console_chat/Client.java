package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Логин: ");
        String log = scanner.nextLine();

        try {
            Socket socket = new Socket("localhost",8389);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        out.writeUTF("Пользователь " + log + " зашёл в чат.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    while (true){
                        String msg = scanner.nextLine();
                        try {
                            out.writeUTF(log + " пишет: "+  msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while(true){
                            String str;
                            str = in.readUTF();
                            System.out.println(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
