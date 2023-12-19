import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        PharmancyComponent azitroment = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmancyComponent water = new Water("Water", "10 Мг", 20);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy3 = new Pharmacy().addComponent(water).addComponent(azitroment);
        Pharmacy pharmacy4 = new Pharmacy().addComponent(water).addComponent(azitroment).addComponent(pinicilin);

        // Drugs List
        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);

        // Get amount of unique elements
        PrintSetResult.Print(result);
        System.out.println("Size: " + result.size());

        // IS EQUALS ?
        System.out.println(pharmacy1.equals(pharmacy2));
        System.out.println(pharmacy1.equals(pharmacy3));

        // IS COMPARE ?
        System.out.println(pharmacy1.compareTo(pharmacy2));
        System.out.println(pharmacy2.compareTo(pharmacy4));
    }
}