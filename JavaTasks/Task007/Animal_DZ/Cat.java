package Animal_DZ;

public class Cat extends Animal implements Goable, Swimable{
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

    @Override
    public Float goSpeed() {
        return 12f;
    }
}
