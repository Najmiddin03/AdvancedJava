package Synchronization;

public class MathUtils {
    // synchronized keyword will make whole method synchronized
    synchronized void getMultiplies(int n) {
        // synchronized block will make only some part of code synchronized
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println("" + e);
                }
            }
        }

    }
}
