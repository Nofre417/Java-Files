import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable<PharmancyComponent>, Comparable<Pharmacy> {
    private List<PharmancyComponent> components = new ArrayList();
    private int index = 0;

    public Pharmacy() {
    }

    public Pharmacy addComponent(PharmancyComponent component) {
        this.components.add(component);
        return this;
    }

    public List<PharmancyComponent> getComponents() {
        return this.components;
    }

    public void setComponents(List<PharmancyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (this != null && this.getClass() == obj.getClass()) {
            Pharmacy pharmacy = (Pharmacy) obj;
            return this.index == pharmacy.index && Objects.equals(this.components, pharmacy.components);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.components, this.index});
    }

    public String toString() {
        String var10000 = String.valueOf(this.components);
        return "Pharmacy{components=" + var10000 + ", index=" + this.index + "}";
    }

    public Iterator<PharmancyComponent> iterator() {
        return new Iterator<PharmancyComponent>() {
            public boolean hasNext() {
                return Pharmacy.this.index < Pharmacy.this.components.size();
            }

            public PharmancyComponent next() {
                return (PharmancyComponent) Pharmacy.this.components.get(Pharmacy.this.index++);
            }
        };
    }

    public int compareTo(Pharmacy pharmacy) {
        if (this.components.size() > pharmacy.components.size()) {
            return -1;
        } else {
            return this.components.size() < pharmacy.components.size() ? 1 : 0;
        }
    }
}
