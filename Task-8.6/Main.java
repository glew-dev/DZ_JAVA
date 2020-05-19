/*
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("File name: ");
            String fn = br.readLine();
            br.close();
            br = new BufferedReader(new FileReader(fn));
            while(true) {
                String l = br.readLine();
                if (l == null) break;
                list.add(Integer.parseInt(l));
            }
            Collections.sort(list);
            for (int i : list)
                if (i % 2 == 0) System.out.println(i);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
