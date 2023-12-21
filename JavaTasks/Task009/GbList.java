public interface GbList<T> {

    GbList<T> add(T item);
    GbList<T> insert(int index, T item);

    GbList<T> addToStart(T item);
    GbList<T> addToEnd(T item);

    T get(int index);

    GbList<T> remove(int index);

    T pop();

    boolean update(T item, int index);

    int size();
}

