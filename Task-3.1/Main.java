/*
Задание 3,1: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да',
 а если нет - выведите 'нет'.
*/
public class Main {
    public static void main(String[] args) {
        int nums[] = {1, 7, 6, 8, 5};
        int i = 0;
        while ((i < nums.length) && (nums[i] != 5))
            i++;
        if (i < nums.length) System.out.println("да");
        else System.out.println("нет");
    }
}
