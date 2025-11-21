package lect12;
class atm{
    private int Totalamount=1000000;
    //getter
    public void checkbalance(){
        System.out.println(Totalamount);
    }
    //setter
    public void deposit(int amount){
        if(amount>0) {
            Totalamount += amount;
            System.out.println(Totalamount);
        }
    }
    public int withdraw(int n){
        if(Totalamount>0 && n<Totalamount){
            Totalamount-=n;
        }
        return Totalamount;
    }

}
public class encapsulationn1 {
    //multiple inheritance error is known as daimond problem
    //encapsulation say to pack as class in single unit
    //security issue is resolve by encapsulation
    public static void main(String []args){
        atm p=new atm();
        p.checkbalance();
        p.deposit(90);
    }
}
