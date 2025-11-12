package lect7;
class laptop{
    String brand;
    int ram;
    float price;
    laptop(String brand,int ram, float price){
        System.out.println(brand+ram+price+" ");
    }
}
public class question3 {
    //0. Create a class Laptop with brand, RAM, and price. Add a constructor to initialize values and a
//method to display them
    public static void main(String[]args){
        laptop l1=new laptop("a1",8,10000);

    }
}
