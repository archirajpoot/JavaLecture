package lect10;
abstract class bank{
    abstract void balance();
}
class user extends bank{
    void balance(){
        System.out.println("NILL");
    }
}
public class abstract1 {
    //abstract class object cant made to achieve abstraction
    //in abstract class only the declaration part will ne there
    //another name is incomplete class
    //we have to give make a child class and define the function in that child class
//    bank b1=new user();
    public static void main(String[]args) {
        user u1 = new user();
        u1.balance();
    }
}
