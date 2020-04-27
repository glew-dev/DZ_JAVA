/*
Задание 2,12: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится'
 и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Делится ");

        if (a%b == 0) System.out.println(a/b);
        else System.out.println("с остатком " + a%b);
    }
}
