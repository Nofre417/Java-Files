package Animal_DZ1;

public class Cat extends Animal{
    @Override
    public void toGO() {
        super.toGO();
    }

    @Override
    public void fly() {
        System.out.println("\u001B[31m" + "Animal cannot fly !" + "\u001B[0m");
    }

    @Override
    public void swim() {
        super.swim();
    }
}
