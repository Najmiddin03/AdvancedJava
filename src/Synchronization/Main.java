package Synchronization;

public class Main {
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        Thread t1 = new Thread1(mu);
        Thread t2 = new Thread2(mu);
        t1.start();
        t2.start();
    }
}
