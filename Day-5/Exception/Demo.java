package Exception;

public class Demo {
    public static void main(String[] args) {
        try {
            int balance=2000;
            int withdraw=2500;
            if(withdraw>balance) {
                System.out.println("insufficient balance");
            } else {
                System.out.println("withdraw successfully");
            }
        }catch(ArithmeticException e) {
            System.out.println("caught an exception"+e.getMessage());
        }
    }
}
