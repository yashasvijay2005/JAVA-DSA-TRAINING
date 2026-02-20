public class strong_no {
    public static void main(String[] args) {
        int n=145;
        int temp=n;
        int r=0;
        while(temp>0){
            int fact=1;
            for(int i=1;i<=temp%10;i++){
                fact=fact*i;
            }
            r=r+fact;
            temp=temp/10;
        }
        if(r==n){
            System.out.println("the number is strong number");
        }
        else{
            System.out.println("the number is not strong number");
        }
    }
}
