package Exception;

public class ThrowableDemo {
    
    static void test() throws Throwable {
        throw new Throwable("Something went wrong!");
    } 
    public static void main(String[] args) {
        try {
            test();
        } catch (Throwable t) {
            // Fully qualified name + message
            System.out.println("Handled: "+t);
            // Message
            System.out.println(t.getMessage());
        }
    }
}

/*
*throw new string("error")❌
*throw new integer("error")❌
*throw new Throwable("error")✅
*throw new Exception("error")✅
*throw new RuntimeException("error")✅
*throw new IOException("error")✅
*/