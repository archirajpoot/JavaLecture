package lect10;
abstract class shape{
    abstract void area();
}
class circle extends shape{
    void area(){
        int r=2;
        System.out.println(3.14*r*r);
    }
}
class rectangle extends shape{
    void area(){
        int l=2;int b=9;
        System.out.println(l*b);
    }
}
public class abstract2 {
    public static void main(String[]args){
        // 1. Create an abstract class 'Shape' with an abstract method 'area()'.
        // Implement two subclasses
        // 'Circle' and 'Rectangle'.
        shape s=new circle();
        shape s1=new rectangle();
        s.area();
        s1.area();
    }
}
