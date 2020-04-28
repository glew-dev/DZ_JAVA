/*
Задание 2,11: В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число
 (в первую, вторую, третью или четвертую).
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.print("Четверть: ");

        if (min < 15) System.out.println("1");
        else if (min < 30) System.out.println("2");
        else if (min < 45) System.out.println("3");
        else System.out.println("4");
    }
}
