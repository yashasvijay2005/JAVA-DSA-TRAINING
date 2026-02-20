import java.util.Scanner;
public class amstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp=n;
        int c=0;
        int r=0;
        while (temp!=0) 
            {
            c++;
            temp=temp/10;
        }
        System.out.println("the number of digits are :"+c);
        temp=n;
        while (temp!=0) {
            r=r+(int)Math.pow(temp%10, c);
            temp=temp/10;
            
        }
        if (r==n) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    sc.close();
    }
}
