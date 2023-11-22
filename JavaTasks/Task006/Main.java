import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("ASUS L510", 4, "Windows10", 215, "Black"));
        set.add(new Laptop("ASUS ROG Strix G16", 16, "Windows11", 1399, "Gray"));
        set.add(new Laptop("Apple 2020", 8, "macOS", 689, "Gold"));
        set.add(new Laptop("Apple 2023", 8, "macOS", 965, "Silver"));

        OperationsWithLaptop operation = new OperationsWithLaptop(set);
        operation.start();
    }
}
