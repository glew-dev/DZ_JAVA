/*Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat. */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Date: ");
        String s = sc.nextLine();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(s);
            System.out.println(new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(date).toUpperCase());
        } catch(Exception e) {
            throw new Exception("Ошибка!");
        }
    }
}
