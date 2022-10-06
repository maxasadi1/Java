package multithreading;

class MultithreadingDemo extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
            multithreadingDemo.start();
        }
    }
}