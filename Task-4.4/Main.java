/*
Задача 4.4
Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
*/
public class Main {
    public static void main(String[] args) {
        String s[] = {"Мама", "Мыла", "Раму"};
        Get(0, 1, 2, s);
        Get(0, 2, 1, s);
        Get(1, 0, 2, s);
        Get(2, 0, 1, s);
        Get(1, 2, 0, s);
        Get(2, 1, 0, s);
    }
    static void Get(int a, int b, int c, String[] s) {
        System.out.println(s[a] + s[b] + s[c]);
    }
}
