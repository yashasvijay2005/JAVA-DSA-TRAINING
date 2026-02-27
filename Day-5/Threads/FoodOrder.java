package Threads;

public class FoodOrder extends Thread {

    String task;
    FoodOrder(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task+" started");
    }
    public static void main(String[] args) {
        FoodOrder cooking = new FoodOrder("Cooking");
        FoodOrder packing = new FoodOrder("Packing");
        FoodOrder serving = new FoodOrder("Serving");

        cooking.start();
        packing.start();
        serving.start();
    }
}

/*
ℹ️points o remember
⭐extend thread
overrde run()
use start()
it is less flexible baecause of inheritance limiation
*/

    