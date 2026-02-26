package hybrid;

public class student extends person implements sports {
    student(String name){
        super(name);
    }
    @Override
    public void play() {
        System.out.println(name + " is playing football.");
    }

    public static void main(String[] args) {
        student student = new student("anup");
        student.play();
    }
}
