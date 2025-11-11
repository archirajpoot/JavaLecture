package lect6;
class detail{
    String name="archi";
    static void print(){
        detail d=new detail();
        System.out.println(d.name);
    }
}
/* method bhi nonstatic hai or name bhi toh access rskte hai string bhi statci hai or stirng static nahi toh bhi acess ho jayga*/
public class class1 {
    public static void main(String []args){
        detail d = new detail();
        d.print();
//        detail d1=new detail();
//        d1.print();
        //. Create a class Student with fields name, rollNumber, and marks. Write a method to display
        // student details. Create 3 student objects and display their data.

    }
}
