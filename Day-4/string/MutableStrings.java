package string;

public class MutableStrings {
    public static void main(String[] args) {
        String s ="SNPSU";
        s +="ISE";
        System.out.println("string: "+s);

        StringBuffer sb = new StringBuffer("SNPSU");
        sb.append("ISE");
        System.out.println("string builder: "+sb);
        StringBuilder sb1 = new StringBuilder("SNPSU");
        sb1.append("ISE");  
        System.out.println("string builder: "+sb1);
    }
}
