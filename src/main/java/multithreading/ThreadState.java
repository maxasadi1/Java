package multithreading;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadJoin());
        System.out.println("ThreadJoin state is "+ thread.getState());
        thread.start();
        System.out.println("ThreadJoin state is "+ thread.getState());
        thread.join(2000);
        System.out.println("ThreadJoin state is "+ thread.getState());
    }
}
