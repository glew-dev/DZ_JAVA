/*
Задание 2.6: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10,
 то выведите 'Верно', иначе выведите 'Неверно'.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a == 10.0)
            System.out.println("Верно");
        else
            System.out.println("Неверно");
    }
}
