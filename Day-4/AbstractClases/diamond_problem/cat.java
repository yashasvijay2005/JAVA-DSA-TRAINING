package diamond_problem;

interface cat {
    default void sound() {
        System.out.println("This cat meows.");
    }
}
