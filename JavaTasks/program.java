import java.util.Scanner;
public class program {

    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name ");
        String name = iScanner.nextLine();
        System.out.printf("Hi, %s!", name);
        iScanner.close();
    }
}