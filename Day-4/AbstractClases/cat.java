abstract class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
    abstract void run();
    //if an abstract class has only abtract metods 
    //its is 100% abstraction

}
public class cat extends Animal{
    @Override
    void run(){
        System.out.println("This cat runs fast.");
    }
}
class cheetah extends Animal{
    @Override
    void run(){
        System.out.println("This cheetah runs very fast.");
    }
}
class demo{
    public static void main(String[] args) {
        cat cat=new cat();
        cheetah cheetah=new cheetah();
        cat.eat();
        cat.run();
        cheetah.eat();
        cheetah.run();
    }
}