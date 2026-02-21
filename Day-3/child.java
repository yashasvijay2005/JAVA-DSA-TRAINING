public class child extends parent {
    int x=20;
    void show (){
        System.out.println(x);
        System.out.println(super.x);

    }
    public static void main(String[] args) {
        child ob = new child();
        ob.show();
    }
    
}

