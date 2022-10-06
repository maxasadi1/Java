package multithreading;

class MultiThreadRunnableDemo implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadRunnable {
    public static void main(String[] args) {
        // i is number of threads
        for (int i = 0; i < 8; i++) {
            Thread thread = new Thread(new MultiThreadRunnableDemo());
            thread.start();
        }
    }
}
