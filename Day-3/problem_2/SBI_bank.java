package problem_2;

public class SBI_bank extends bank {
    void interest(double rate,int years) {
        double totalinterest=(1000*rate*years)/100;
        System.out.println("the total interest is "+totalinterest);
    }
public static void main(String[] args) {
    SBI_bank ob=new SBI_bank();
    ob.interest();
    ob.interest(6.5,2);
    
}
}