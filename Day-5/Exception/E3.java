package Exception;

public class E3 {
    static void checkAge(int age) {
        if(age>=18) {
            System.out.println("You are Eligible to Vote");
        } else {
            throw new RuntimeException("You are not Eligible to Vote");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
