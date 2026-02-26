public interface browers {
    void browers();


}

interface browers1 {

    void browers1();
    
}

interface browers2 {
    void browers2();
    
}

class demo implements browers, browers1, browers2 {

    @Override
    public void browers() {
        System.out.println("google chrome");
    }

    @Override
    public void browers1() {
        System.out.println("safari.");
    }

    @Override
    public void browers2() {
        System.out.println("firefox.");
    }

    public static void main(String[] args) {
        demo demo = new demo();
        demo.browers();
        demo.browers1();
        demo.browers2();
    }

    
}