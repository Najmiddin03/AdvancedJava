package Generics;

public class GenericHolder<T> {
    T obj;

    GenericHolder(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
