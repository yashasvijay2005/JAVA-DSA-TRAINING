package string;

public class stringpool {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        System.out.println(s1==s2);//true because both s1 and s2 are referring to the same string literal in the string pool
        String s3=new String("java");
        System.out.println(s1==s3);//false because s3 is created using the new
        System.out.println(s1.equals(s3));//true because the content of both s1 and s3 is the same
    }
}
