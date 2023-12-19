import java.util.Iterator;
import java.util.Set;

public class PrintSetResult {
    public PrintSetResult() {
    }

    static void Print(Set<Pharmacy> set) {
        Iterator var1 = set.iterator();

        while (var1.hasNext()) {
            Pharmacy pharma = (Pharmacy) var1.next();
            System.out.println("\n-> " + String.valueOf(pharma));
        }

    }
}
