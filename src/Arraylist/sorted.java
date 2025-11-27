//package Arraylist;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//class student implements Comparable<student>{
//    String name;
//    int rollno;
//    public student(String name,int rollno){
//        this.name=name;
//        this.rollno=rollno;
//    }
//    public  int compareTo(student s1){
//        return this.rollno-s1.rollno;
//    }
//
//    @Override
//    public String toString() {
//        return this.name+" "+this.rollno;
//    }
//}
//public class sorted {
//    public static void main(String[]args){
//        ArrayList<student> list=new ArrayList<>();
//        list.add(new student("archi",1));
//        list.add(new student("shreya",2));
//        Collections.sort(list);
//        System.out.println(list);
//    }
//
//}
package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class student {
    String name;
    int rollno;
    public student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
//    public  int compareTo(student s1){
//        return this.name;
//    }

    @Override
    public String toString() {
        return rollno+" "+name;
    }
}

class namesort implements Comparator<student>{
    public int compare(student s1,student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class sorted {
    public static void main(String[]args){
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("archi",1));
        list.add(new student("aanya",2));
        Collections.sort(list,new namesort());
        System.out.println(list);
    }

}
