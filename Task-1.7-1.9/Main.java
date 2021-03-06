import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
Задание 1.7
Запросить у пользователя число и записать его в переменную redius.
Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.
*/
        double Pi = 3.14, L;
        double radius = sc.nextDouble();// запятая, а не точка при вводе значения для русской локализации.
        L = 2 * Pi * radius;
        System.out.println(L);
/*
Задание 1.8
Запросить у пользователя число(температуру в цельсиях) и записать его в переменную.
Программа должна переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Например: для числа 41 результат будет 105.8
*/
        double TC = sc.nextDouble();// запятая, а не точка при вводе значения для русской локализации.
        double TF = (9.0 / 5.0) * TC + 32.0;
        System.out.println(TF);
/*
Задание 1.9
Запросить у пользователя 2 числа (сохранить их в разные переменные)
Вывести на экран максимальное из двух чисел, если числа равны, вывести их сумму.
*/
        double a = sc.nextDouble();// запятая, а не точка при вводе значения для русской локализации.
        double b = sc.nextDouble();// запятая, а не точка при вводе значения для русской локализации.
        if (a == b) System.out.println(a + b);
        else
            if (a > b) System.out.println(a);
            else System.out.println(b);
    }
}
