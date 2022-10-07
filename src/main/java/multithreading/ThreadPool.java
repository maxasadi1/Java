package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Start: " + Thread.currentThread().getName());
        try {
            System.out.println("Running: " + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class ThreadPool {

    static final int MAX_THREAD = 3;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREAD);
        for (int threadCounter = 0; threadCounter < 10; threadCounter++) {
            MyThread myThread = new MyThread("thread-" + threadCounter);
            executorService.execute(myThread);
//            myThread.start();
        }
    }
}
