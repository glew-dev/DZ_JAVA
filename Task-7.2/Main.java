/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
(Придётся погуглить коллекции)
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Месяц: ");
        String s = sc.nextLine();

        List<String> month = new ArrayList<>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        int n = month.indexOf(s);
        if (n < 0) { throw new IOException("Ошибка!"); }
        else System.out.println(s + " is the " + (n+1) + " month");
    }
}
