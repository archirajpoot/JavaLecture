package lect10;
abstract class shape{
    abstract void area();
}
class circle extends shape{
    int r;
    public circle(int r){
        this.r=r;
    }
    void area(){
        System.out.println(3.14*r*r);
    }
}
class rectangle extends shape{
    int l,b;
    public rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println(l*b);
    }
}
public class abstract2 {
    public static void main(String[]args){
        // 1. Create an abstract class 'Shape' with an abstract method 'area()'.
        // Implement two subclasses
        // 'Circle' and 'Rectangle'.
        shape s=new circle(2);
        shape s1=new rectangle(8,9);
        s.area();
        s1.area();
    }
}
