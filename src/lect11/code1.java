package lect11;
//java dont support multiple inheritence because if the child class called two
interface a{
//   abstract void name();
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

