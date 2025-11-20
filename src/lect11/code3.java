package lect11;

public class code3 {
    public static void main(String[] args) {
        // Q5. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
        // Create a class Car that implements Vehicle.
        // Call the default method from an object of Car in the main method
        car c = new car();
        //c.pop();
        c.start();
    }
}

interface A{
    abstract void pop();
    default void start(){
        System.out.println("Vehicle is starting");
    }
}
class car implements A{
    public void pop(){
        System.out.println("Jaldi vaha se hato");
    }
}
