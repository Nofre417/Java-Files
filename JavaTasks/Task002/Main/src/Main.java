import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        if(hour >= 5 && hour < 12)
        {
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Дорый день, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Дорый вечер, " + name + "!");
        } else
        {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}