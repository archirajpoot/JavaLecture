package lect6;

public class variable {
    /* class ke andar function use krte hai toh usko method bolte hai or normal wale ko function
     main method ke bahar jo varisble declare hoga vph intsant or static variable bolte hai
     static variable -
     class ke andar main method ke bhar
     static keyword ni laga hoga
     the only way to acess non static variable is to create a varibale
     if the variable is static then we can access the variable without any object*/
    void name(){
        System.out.println("archhii");
    }
    static void naame(){
        System.out.println("archhii");
    }
    int a = 5; //Instant-not acciseable to main directly without using the object
    static int data=10;      //static
    public static void main(String[] args) {
        // here the jvm when call teh function it will not make the object of main function because static keyword is useddd
        //        int a=5;
        variable obj = new variable();
        obj.name();
        naame();
        System.out.println(obj.a);
        System.out.println(data);
    }
}
