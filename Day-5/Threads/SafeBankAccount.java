package Threads;

public class SafeBankAccount    
 {
     int balance = 1000;
    synchronized void withdraw(int amount) {
        balance -= amount;
    }
    public static void main(String[] args) throws InterruptedException {
        SafeBankAccount acc = new SafeBankAccount();
        Thread t1 = new Thread(() -> acc.withdraw(500));
        Thread t2 = new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join(); // join will make sure that the main thread waits for the child threads to complete
        System.out.println("Final balanace: "+acc.balance);
    }
}

/*
Code Explaination
The Synchronized keyword ensures that only one thread
can execute withdraw() opration at a time, preventing RACE CONDITION
and ensuring correct balance deduction.

ℹ️ Points to remember
💫 Synchronisation avoids RACE CONDITION
💫 Locks critical section in an application
💫 Slower but safe
💫 Essential for shared resources
*/