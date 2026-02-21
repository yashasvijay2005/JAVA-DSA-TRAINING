public class car extends vehicle {
    void speed(String mode){
        System.out.println("the car is at 100km/hr in "+mode+" mode");
    }
    public static void main(String[] args) {
        car ob=new car();
        ob.speed("jet");
        ob.speed(150);
    }
    
}
   