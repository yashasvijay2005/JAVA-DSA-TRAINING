public class GC_Demo {
    
    public static void main(String[] args) {
        GC_Demo obj = new GC_Demo();
        obj = null;
        System.gc();

        // Now-a-days the gc() method is automatically invoked
        // after program execution by the object class
        // for clutter , garbarge collection & remova; by the jvm
        // We do not need to call it explixitly

        System.out.println("GC requested");
    }
}