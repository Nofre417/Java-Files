package Animal_DZ;

public interface Swimable {
    public default Float swimSpeed() {
        return 10f;
    }

}
