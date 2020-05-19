/*
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        List<String> fam = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            list.add(city);
            fam.add(family);
        }
        System.out.print("Город: ");
        String s = reader.readLine();

        int n = list.indexOf(s);
        if (n < 0) { throw new IOException("Ошибка!"); }
        System.out.println(fam.get(n));
    }
}
