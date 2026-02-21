class animal2 {
    void sound() {
        System.out.println("the animal makes a sound");
    }
}

class dog1 extends animal2 {
    void sound() {
        System.out.println("the dog barks");
    }

    public static void main(String[] args) {
        animal2 ob = new dog1();
        ob.sound();
    }
}
