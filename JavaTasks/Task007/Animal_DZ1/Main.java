package Animal_DZ1;

public class Main {
    public static void main(String[] args) {
        Animal duck = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println("------------");
        System.out.println("Duck");
        duck.toGO();
        duck.fly();
        duck.swim();

        System.out.println("------------");
        System.out.println("Cat");
        cat.toGO();
        cat.fly();
        cat.swim();

        System.out.println("------------");
        System.out.println("Dog");
        dog.toGO();
        dog.fly();
        dog.swim();
    }
}
