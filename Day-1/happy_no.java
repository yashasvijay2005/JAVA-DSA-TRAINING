
import java.util.*;
public class happy_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int r=0;
        while(n!=1 && n!=4){
            r=0;
            while(n>0){
                r=r+(int)Math.pow(n%10, 2);
                n=n/10;
            }
            n=r;
        }
        if(n==1){
            System.out.println("the number is happy number");
        }
        else{
            System.out.println("the number is not happy number");
        
        }
sc.close();
    }
}
