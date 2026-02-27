package Exception;

public class FeeRegistration {
    static class  FormFilling extends Thread {
        public void run(){
            System.out.println("Form Filling Started");
        }  
    }
    static class  DocumentUpload extends Thread {
        public void run(){
            System.out.println("Document Upload Started");
        }  
    }
    static class  EmailNotification extends Thread {
        public void run() {
            System.out.println("Confirmation Email Sent!");
        }
        
    }
    public static void main(String[] args) {
        FormFilling formFilling = new FormFilling();
        DocumentUpload documentUpload = new DocumentUpload();
        EmailNotification emailNotification = new EmailNotification();

        formFilling.start();
        documentUpload.start();
        emailNotification.start();
    }
}
/*
🧵
java proram starts with one main thread.
 thread allows parllel execution of code->concurreny
 output order is not guaranteed
 threads share the same memory 
 improves the performance of the program 
 when start() is called ,the JVM creates a new thread
 when run() is called directly ,there is no concurrency

thread🆚 process

process is a runing program 
thread : a path of exection within a process
a process has its own memory 
threads share the same memory
creating a thread is cheaper than creating a process
 
*/


