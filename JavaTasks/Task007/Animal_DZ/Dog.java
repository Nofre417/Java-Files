package Animal_DZ;

public class Dog extends Animal implements Goable, Swimable{



    @Override
    public void toGO() {
        super.toGO();
    }

    @Override
    public void fly() {
        System.out.println("\u001B[33m" + "Animal cannot fly, but the aniaml can bark !" + "\u001B[0m");
        System.out.println(Bark());
    }

    @Override
    public void swim() {
        super.swim();
    }

    private String Bark(){
        return "GAV-GAV-GAV-!";
    }

    @Override
    public Float goSpeed() {
        return 15f;
    }
}
