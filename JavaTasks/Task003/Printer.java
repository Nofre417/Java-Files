import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
int[] arr - числовой массив
После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt'
в формате год-месяц-день час:минуты {массив на данной итерации}.
 */

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    String logPath = "log.txt";

    createLoger(logPath);


    public static void sort(int[] mas) {
        int len = mas.length;

        for (int i = 0; i < len; i++){
            for(int j = 0; j < len - i - 1; j++){
                if(mas[j] > mas[j+1]){
                    int temp = mas[j+1];
                    mas[j+1] = mas[j];
                    mas[j] = temp;

                    for(int k = 0; k < len; k++){
                        String str =  mas[k];
                    }

                }
            }
        }
    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}