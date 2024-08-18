package Synchronization;

public class Thread2 extends Thread {
    MathUtils mu;

    public Thread2(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        mu.getMultiplies(3);
    }
}
