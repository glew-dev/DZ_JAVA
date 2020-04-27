/*
Задание 2,10: Назовем «весом числа» сумму его цифр. Напишите код, который принимает от пользователя число и
выводит на экран его «вес».
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // а если double? - мрачно совсем, так нельзя.
        int w = 0;
        while (a != 0){
            w = w + a % 10;
            a = a / 10;
        }
        System.out.println(w);
    }
}
