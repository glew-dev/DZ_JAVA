/*
Задача 4.1
Написать функцию, которая возвращает минимум из двух чисел.
Задача 4.2
Написать функцию, которая возвращает минимум из трёх чисел.
Задача 4.3
Написать функцию, которая возвращает минимум из четырёх чисел. Функция min(a,b,c,d) должна использовать (вызывать)
 функцию min(a,b) (которую вы разработали в задаче 4.1).
*/
public class Main {
    public static void main(String[] args) {
        double n = min(1, 2);
        System.out.println(n);
        n = min3(1, 2, 3);
        System.out.println(n);
        n = min4(1, 2, 3, 4);
        System.out.println(n);
    }
    static double min(double a, double b){
        if (a < b) return a;
        else return b;
    }
    static double min3(double a, double b, double c){
        return min(min(a, b), c);
    }
    static double min4(double a, double b, double c, double d){
        return min(min(a, b), min(c, d));
    }
}
