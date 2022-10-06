package multithreading;

public class ThreadJoin implements Runnable{
    @Override
    public void run() {

        Thread threadSleep = new Thread(new ThreadSleep());
        System.out.println("ThreadSleep state is "+ threadSleep.getState());
        threadSleep.start();
        System.out.println("ThreadSleep state is "+ threadSleep.getState());
        try {
            System.out.println("ThreadSleep state is "+ threadSleep.getState());
            threadSleep.join();
            System.out.println("ThreadSleep state is "+ threadSleep.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
