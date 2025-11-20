package lect11;
//java dont support multiple inheritence because if the child class called two parent
// class and if they have the same name function then it will confuse the complier to ehuch
// it call so we can use the concept of interface in java
//difference between interface and abstract class
// interface is fully abstract means can hide the details completely
// interface don't have constructor whereas abstract class had. interface mai class hi ni hai toh constructor kaise bnega kyuki constructor class ka hi bnta hai
//interface mai koi bhi function banega toh voh abstract hi rahega hum usko abstract declare kare ya na kare
//interface mai jab multiple inhertenece lgayge toh koi child class implements karegi dono interface ko
 interface a{
   abstract void name();
//   a(){
//       System.out.println("archi");
//   }
}
interface b{
   abstract void name();
}
class c implements a,b{
    public void name(){
         System.out.println("archi");
     }
}
public class code1 {
    public static void main(String[]args){
        c c1= new c();
        c1.name();
    }
}

