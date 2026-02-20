import java.util.Scanner;

public class reverse {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int d =0;
        int r =0;

        while (n>0) {
            
            d=n%10;
            r=r*10+d;
            n=n/10;
            
        }
    System.out.println("Reverse of the number is: " + r);
    sc.close();
     }
}
