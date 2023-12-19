public class PharmancyComponent implements Comparable<PharmancyComponent> {
    private String name;
    private String weight;
    private int power;

    public PharmancyComponent(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return "PharmancyComponent{name='" + this.name + "', weight='" + this.weight + "', power=" + this.power + "}";
    }

    public int compareTo(PharmancyComponent o) {
        if (this.power > o.power) {
            return -1;
        } else {
            return this.power < o.power ? 1 : 0;
        }
    }
}