import java.util.Iterator;
import java.util.List;

public class IteratorComponent implements Iterator<PharmancyComponent> {
    private List<PharmancyComponent> components;
    private int index;
    private Pharmacy pharmacy;

    public IteratorComponent(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        this.components = pharmacy.getComponents();
        this.index = pharmacy.getIndex();
    }

    public boolean hasNext() {
        return this.index < this.components.size();
    }

    public PharmancyComponent next() {
        return (PharmancyComponent)this.components.get(this.index++);
    }
}