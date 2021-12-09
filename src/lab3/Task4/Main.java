package lab3.Task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(final String[] args) {
        final Thread thread1 = new Thread(new Runnable1());
        final Thread thread2 = new Thread(new Runnable2());
        final Thread thread3 = new Thread(new Runnable3());

        thread1.start();
        thread2.start();

        final ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(thread3);

        try{
            executor.shutdown();
        } catch (final Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }
    }

    public static class Runnable1 implements Runnable {
        @Override
        public void run() {
            SimpleCalculations.add(.17, 2.1);
            SimpleCalculations.sub(.6, 9.1);
        }
    }

    public static class Runnable2 implements Runnable {
        @Override
        public void run() {
            SimpleCalculations.multi(100.5, 2.1);
            SimpleCalculations.divide(9.1, .1);
        }
    }

    public static class Runnable3 implements Runnable {
        @Override
        public void run() {
            System.out.println("Executed another thread");
        }
    }
}