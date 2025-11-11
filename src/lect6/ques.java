package lect6;

class student{
    String name="";
    int roll=0;
    int marks=0;
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }
}

public class ques {
    public static void main(String[]args){
     //. Create a class Student with fields name, rollNumber, and marks. Write a method to display
        // student details. Create 3 student objects and display their data.
        student s1=new student();
        s1.marks=93;
        s1.roll=20;
        s1.name="btech";
        student s2=new student();
        s2.marks=93;
        s2.roll=20;
        s2.name="btech";
        student s3=new student();
        s3.marks=93;
        s3.roll=20;
        s3.name="btech";
        s1.display();
        s2.display();
        s3.display();




    }
}
