/*
Задание 2,8: С помощью цикла for сформируйте строку '123456789' и запишите ее в переменную str.
*/
public class Main {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i < 10; i++) str = str + i;
        System.out.println(str);
    }
}
