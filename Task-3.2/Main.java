/*
Задание 3,2: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main {
    public static void main(String[] args) {
        int nums[] = {1, 7, 6, 8, 5, 8};
        int i = 0;
        while ((i < (nums.length - 1)) && (nums[i] != nums[i+1]))
            i++;
        if (i < (nums.length - 1)) System.out.println("да");
        else System.out.println("нет");
    }
}
