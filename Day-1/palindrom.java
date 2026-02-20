import java.util.Scanner;   
public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int r =0;
        int temp=n;
        while(n>0){
            r=r*10+n%10;
            n=n/10; 
        }
        if(temp==r){
            System.out.println("the number is palindrom");
        }
        else{
            System.out.println("the number is not palindrom");
        }
        sc.close();


    }
}

