package Threads;

public class ThreadwithPriority extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+" | Priority: ");
            Thread.currentThread().getPriority();
        }
    }
    public static void main(String[] args) {
        ThreadwithPriority t1 = new ThreadwithPriority();
        ThreadwithPriority t2 = new ThreadwithPriority();
        ThreadwithPriority t3 = new ThreadwithPriority();
        t1.setName("low Priorrity Thread");
        t1.setName("Medium Priorrity Thread");
        t1.setName("High Priorrity Thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}