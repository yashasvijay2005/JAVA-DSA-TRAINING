public interface animal {
    void sound();
    void eat();
    //if an interface has only abtract metods 
    //its is 100% abstraction
}
class cat implements animal{
    @Override
    public void sound() {
        System.out.println("This cat meows.");
    }

    @Override
    public void eat() {
        System.out.println("This cat eats fish.");
    }
}

class demo {
public static void main(String[] args) {
    cat cat = new cat();
    cat.sound();
    cat.eat();
}

}
