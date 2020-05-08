/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false*/

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String s = "MAY 1 2013"; //MAY 1 2013//JANUARY 1 2000//JANUARY 2 2020
        System.out.println(s + " = " + isDateOdd(s));
    }
    public static boolean isDateOdd(String date) {
        Date d = new Date(date);
        LocalDate n = LocalDate.of(d.getYear(), d.getMonth()+1, d.getDate());
        return (n.getDayOfYear() % 2) != 0;
    }
}
