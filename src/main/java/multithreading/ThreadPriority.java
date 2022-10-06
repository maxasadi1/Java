package multithreading;

class ThreadPriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Current thead is : " + Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadPriority {

    public static void main(String[] args) {
        ThreadPriorityDemo threadPriorityDemo0 = new ThreadPriorityDemo();
        ThreadPriorityDemo threadPriorityDemo1 = new ThreadPriorityDemo();
        ThreadPriorityDemo threadPriorityDemo2 = new ThreadPriorityDemo();

        // Display the priorities of above threads
        // using getPriority() method
        System.out.println("threadPriorityDemo0 priority is : " + threadPriorityDemo0.getPriority());
        System.out.println("threadPriorityDemo1 priority is : " + threadPriorityDemo1.getPriority());
        System.out.println("threadPriorityDemo2 priority is : " + threadPriorityDemo2.getPriority());

        // Setting priorities of above threads by
        // passing integer arguments
        threadPriorityDemo0.setPriority(2);
        threadPriorityDemo1.setPriority(4);
        threadPriorityDemo2.setPriority(5);

        // Display the priorities of above threads
        // using getPriority() method
        System.out.println("threadPriorityDemo0 priority is : " + threadPriorityDemo0.getPriority());
        System.out.println("threadPriorityDemo1 priority is : " + threadPriorityDemo1.getPriority());
        System.out.println("threadPriorityDemo2 priority is : " + threadPriorityDemo2.getPriority());


        threadPriorityDemo0.start();
        threadPriorityDemo1.start();
        threadPriorityDemo2.start();
    }

}
