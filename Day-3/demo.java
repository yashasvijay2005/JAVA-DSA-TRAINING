public class demo {
    public static void main(String[] args) {
    int[] arr= {1,2,3,1,2,4,3};
    int reult=0;
    for(int i=0;i<arr.length;i++){
        reult=reult^arr[i];
    }   
    System.out.println("the unique element is: " + reult);
}
}
