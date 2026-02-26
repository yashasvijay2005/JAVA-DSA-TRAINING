package string;

public class builderExample {
    
    public void stringInsert() {
     StringBuilder sb = new StringBuilder("jaa");
        System.out.println("old string: "+sb);
        sb.append("SNPSU");
        System.out.println("new string: "+sb);
    }
    public void stringAppend() {
        StringBuilder sb = new StringBuilder("SNPSU");
        System.out.println("old string: "+sb);
        sb.append("ISE");
        System.out.println("new string: "+sb);
    }
    public void stringReverse() {
        StringBuilder sb = new StringBuilder("nontyp");
        System.out.println("old string: "+sb);
        System.out.println("new string: "+sb.reverse());
    }
    
    public static void main(String[] args) {
        builderExample Obj = new builderExample();
        Obj.stringInsert();
        Obj.stringAppend();
        Obj.stringReverse();
    }
}


