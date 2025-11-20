package lect11;
interface walkable{
    void walk();
    void run();
}
interface runable {
    void walk();
    void run();
}
class human implements walkable,runable{
    public void walk(){
        System.out.println("human can walk");
    }
    public void run(){
        System.out.println("human can run");
    }
}
public class code2 {
    public static void main(String[]args){
        // Q1. Create two interfaces Walkable and Runnable.
        //Each should have a method: walk() and run() respectively.
        // Then, create a class Human that implements both interfaces and defines both methods.
        // Create a main method where an object of Human is created and both methods are called.
        human h1=new human();
        h1.walk();
        h1.run();

    }
}
