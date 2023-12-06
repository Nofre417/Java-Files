package Animal_DZ;

public class Doctor {
    public String name;
    public String contact = "clinic@gmail.com";

    public static void toHeal(Animal animal){
        if(animal.health < 100){
            System.out.println("The animal health: " + animal.health);
            int needToHeal = 100 - animal.health;
            animal.health += needToHeal;
            System.out.println("Doctor healing an animal");
            System.out.println("The animal health after healing: " + animal.health);
        }
        else {
            System.out.println("Health of the animal is full");
            System.out.println("The animal health: " + animal.health);
        }
    }
}