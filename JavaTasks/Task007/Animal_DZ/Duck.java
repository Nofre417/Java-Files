package Animal_DZ;

public class Duck extends Animal implements Goable, Swimable, Flyable {
    @Override
    public void toGO() {
        super.toGO();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public Float goSpeed() {
        return 6f;
    }

    @Override
    public Float flySpeed() {
        return 60f;
    }

    @Override
    public Float swimSpeed() {
        return 13f;
    }
}
