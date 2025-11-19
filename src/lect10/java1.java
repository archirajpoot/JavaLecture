package lect10;
class things{
    void name(){
        System.out.println("bed");
    }
}
class work extends things{
    void name(){
        System.out.println("table");
    }
    void workk(){
        System.out.println("help human");
    }
}
public class java1 {
    public static void main(String[]args){
        things t1=new work();
        t1.name();
        work t2=(work)t1;
        t2.workk();
    }
}
