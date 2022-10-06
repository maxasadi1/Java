package multithreading;

public class ThreadSleep implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("ThreadSleep before sleep" );
            Thread.sleep(4000);
            System.out.println("ThreadSleep after sleep");
            for (int i = 0; i < 2000; i++) {
                System.out.print(i);
            }
            System.out.println("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
