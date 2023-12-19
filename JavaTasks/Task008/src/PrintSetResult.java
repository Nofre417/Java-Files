import java.util.Set;

public class PrintSetResult {
    static void Print(Set<Pharmacy> set){
        for (Pharmacy pharma: set) {
            System.out.println("\n-> " + pharma);
        }
    }
}
