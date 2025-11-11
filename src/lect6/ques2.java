package lect6;
class rectangle{
   int length;
   int breath;
   void area(){
       System.out.println(length*breath);
   }
   void perimeter(){
       System.out.println(2*(length+breath));
   }
}
public class ques2 {
    public static void main(String []args){
        /*2. Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
        perimeter. Create objects with different values and call those methods.*/
        rectangle r=new rectangle();
        r.length=10;
        r.breath=20;
        r.area();
        r.perimeter();
    }
}
