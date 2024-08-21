package Generics;

public class DualGenericHolder<T, U> {
    T t;
    U u;

    DualGenericHolder(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public void display() {
        System.out.println(this.t);
        System.out.println(this.u);
    }
}
