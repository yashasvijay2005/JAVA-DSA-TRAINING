import java.util.Scanner;
public class automorphic {
    static void automorphic(int n) {

        int square = n * n;
        int temp = n;
        boolean isAutomorphic = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println(n + " is an automorphic number.");
        } else {
            System.out.println(n + " is not an automorphic number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        automorphic(n);
        sc.close();
    }
    
    
}
