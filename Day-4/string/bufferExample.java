package string;

public class bufferExample {

    public void stringInsert() {
        StringBuffer sb = new StringBuffer("jaa");
        System.out.println("old string: "+sb);
        sb.append("SNPSU");
        System.out.println("new string: "+sb);
    }
    public void stringAppend() {
        StringBuffer sb = new StringBuffer("SNPSU");
        System.out.println("old string: "+sb);
        sb.append("ISE");
        System.out.println("new string: "+sb);
    }
    public void stringReverse() {
        StringBuffer sb = new StringBuffer("nontyp");
        System.out.println("old string: "+sb);
        System.out.println("new string: "+sb.reverse());
    }
    
    public static void main(String[] args) {
        bufferExample Obj = new bufferExample();
        Obj.stringInsert();
        Obj.stringAppend();
        Obj.stringReverse();
    }
}
