package lect7;
class Rectanglee{
    int length;
    int breath;
    Rectanglee( int length, int breath){
        this.length=length; //this is used to access the instant variable the variable which is non static
        this.breath=breath;
        System.out.println(length*breath);
    }
}
public class question1 {
  public static void main(String []args){
      /*2. Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
        perimeter. Create objects with different values and call those methods.*/
      Rectanglee r1= new Rectanglee(3,5);
      System.out.println(r1.length);
      System.out.println(r1.breath);
      Rectanglee r2= new Rectanglee(2,3);
      System.out.println(r2.length);
      System.out.println(r2.breath);


  }
}
