/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего читать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("File name: ");
            String fn = br.readLine();
            bw = new BufferedWriter(new FileWriter(fn));
            System.out.println("Enter 'exit' for close");
            while (true) {
                String ln = br.readLine();
                if (ln.equals("exit")) break;
                bw.write(ln + "\n");
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
            bw.close();
        }
    }
}
