package diamond_problem;

public interface dog {
    default void sound() {
        System.out.println("This dog barks.");
    }
}