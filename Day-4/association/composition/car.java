package association.composition;

class engine {
    void start(){
        System.out.println("engine starts");
    }
}
public class car {
    private engine eng;
    car(){
        eng=new engine();//tight coupling
    }
    void start(){
        eng.start();
    }

    void drive(){
        eng.start();
        System.out.println("car is moving");
    }  
    public static void main(String[] args) {
        car c1 = new car();
        c1.drive();
    }


}
