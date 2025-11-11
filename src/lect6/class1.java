package lect6;

class detail{
     String name="archi";
    void print(){
//        detail d=new detail();
        System.out.println(name);
    }
}
//key pointss
/* When both the member method and the variable are non static then they can acess each other
*  when the variable is static and method is non static then they can acess each other
* when the mehtod is static but the variable is non static then they can acess each oher to resolve this we
* can create a object within the mehtod of that class to acces the thingss */
public class class1 {
    public static void main(String []args){
        detail d = new detail();
        d.print();
//        detail d1=new detail();
//        d1.print();

    }
}
