package diamond_problem;

public class happy implements cat, dog {
    @Override
    public void sound() {
        dog.super.sound();
    }
    
}

class demo{
    public static void main(String[] args) {
        happy happy = new happy();
        happy.sound();
    }
}

    

