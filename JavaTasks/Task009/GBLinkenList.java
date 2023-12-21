public class GBLinkenList<T> implements GbList<T> {

    private T[] values;
    private int size;
    private int capacity;

    public GBLinkenList() {
        capacity = 16;
        // try - попробуй
        try {
            this.values = (T[]) new Object[capacity];
            // catch - поймай
        } catch (ClassCastException e) {
            // выведи ошибки
            e.printStackTrace();
        }
        size = 0;
    }

    private void addCapasity() {
        T[] temp = (T[]) new Object[capacity / 2 * capacity];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }



    @Override
    public GbList<T> add(T item) {
        if (size == capacity) {
            addCapasity();
        }
        values[size++] = item;
        return this;
    }

    @Override
    public GbList<T> insert(int index, T item) {
        try {
            if(index > 0 || index < capacity){
                if(size == capacity){
                    addCapasity();
                }
                if(index == 0){
                    return addToStart(item);
                } else if(index == size){
                    return add(item);
                }
                else {
                    T[] temp = values;
                    values = (T[]) new Object[temp.length + 1];
                    System.arraycopy(temp, 0, values, 0, index);
                    values[index] = item;
                    int amountItemAfterIndex = size - index;
                    System.arraycopy(temp, amountItemAfterIndex, values, index + 1, amountItemAfterIndex);
                }
            }
        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        return this;
    }

    @Override
    public GbList<T> addToStart(T item) {
        T[] temp = values;
        values = (T[]) new Object[temp.length + 1];
        values[0] = item;
        System.arraycopy(temp, 0, values, 1, temp.length - 1);
        return this;
    }

    @Override
    public GbList<T> addToEnd(T item) {
        add(item);
        return this;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public GbList<T> remove(int index) {

        T[] temp = values;
        values = (T[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        int amountItemAfterIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, values, index, amountItemAfterIndex);
        size--;
        return this;
    }

    @Override
    public T pop() {
        T value;
        T[] temp = values;
        value = values[0];
        values = (T[]) new Object[temp.length - 1];
        System.arraycopy(temp, 1, values, 0, temp.length - 1);
        size--;
        return value;
    }

    @Override
    public boolean update(T item, int index) {
        try {
            values[index] = item;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        while (values[i] != null) {
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
