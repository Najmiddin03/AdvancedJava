package Concurrency;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(5000);
            return "Completed";
        });

        try {
            while (!future.isDone()) {
                System.out.println("Still in progress");
                Thread.sleep(500);
            }
            System.out.println("Task completed");
            String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);
            executorService.shutdown();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
