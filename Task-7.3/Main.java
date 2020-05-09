/* Задача: Разработать метод который возвращает дату пасхи.
Передаём в качестве параметра год. Метод возвращает дату пасхи в этом году.
Подсказка: воспользуйтесь алгоритмом Гаусса вычисления даты Пасхи.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int year = 2020;
        LocalDate ld = getEaster(year);
        DateTimeFormatter frm = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println(ld.format(frm));
    }
    /* расчёт Католической пасхи (по григорианскому календарю).
     https://ru.wikipedia.org/wiki/Алгоритм_Гаусса_вычисления_даты_Пасхи*/
    static LocalDate getEaster(int year){
        int month;
        int day;
        
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        /* Разделить сумму 19a + 15 на 30 и определить остаток d.
        Разделить сумму 2b + 4c + 6d + 6 на 7 и определить остаток e.
        Определить сумму f = d + e.
        (по новому стилю в XX—XXI веках) Если f <= 26, то Пасха будет праздноваться 4 + f апреля;
        если f > 26, то Пасха будет праздноваться f — 26 мая.*/
        int d = (19*a + 15) % 30;
        int e = (2*b + 4*c + 6*d + 6) % 7;
        int f = d + e;
        if (f > 26) {
            month = 5; 
            day = f - 26;
        }
        else {
            month = 4;
            day = 4 + f;
        }
        return LocalDate.of(year, month, day);
    }
}
