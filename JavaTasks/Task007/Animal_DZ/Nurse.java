package Animal_DZ;

public class Nurse {
    public String name;

    public static void toFeed(Animal animal){
        if (animal.food < 100){
            System.out.println("The animal food: " + animal.food);
            int needToFeed = 100 - animal.food;
            animal.food += needToFeed;
            System.out.println("Animal was fully fed");
            System.out.println("The animal food after feeding: " + animal.food);
        }
        else {
            System.out.println("Animal has full food" + " (" + animal.food + ") ");
        }
    }
}
