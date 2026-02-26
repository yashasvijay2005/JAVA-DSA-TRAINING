package string;

public class stringBaseExample {
    public static void main(String[] args) {
        char[] letters={'a','n','u','p'};

        String name =new String (letters);
        System.out.println(name);
        String jumbled="yashas1is1not1a1good1boy";
        String [] words=jumbled.split("1");

        for(Object o : words){
            System.out.print(o+" ");
        }

        System.out.println();
        String data="  this is yashas  ";
        System.out.println(data.trim());
        System.out.println();
    }
}
