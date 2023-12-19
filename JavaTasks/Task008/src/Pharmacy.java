import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable<PharmancyComponent>, Comparable<Pharmacy> {

    private List<PharmancyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmancyComponent component) {
        components.add(component);
        return this;
    }

    public List<PharmancyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmancyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public PharmancyComponent next() {
//        return components.get(index++);
//    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this == null || getClass() != obj.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) obj;
        return (index == pharmacy.index && Objects.equals(components, pharmacy.components));
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, index);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    // вынесенный класс Iterable
//    @Override
//    public Iterator<PharmancyComponent> iterator() {
//        return new IteratorComponent(this);
//    }

    //анонимный класс Iterable
    @Override
    public Iterator<PharmancyComponent> iterator() {
        return new Iterator<PharmancyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmancyComponent next() {
                return components.get(index++);
            }
        };
    }
    @Override
    public int compareTo(Pharmacy pharmacy) {
        if(this.components.size() > pharmacy.components.size())
            return -1;
        else if(this.components.size() < pharmacy.components.size())
            return 1;
        else
            return 0;
    }

}