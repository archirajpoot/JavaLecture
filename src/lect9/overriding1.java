package lect9;
class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("roti");
    }
}
class overriding1{
    public static void main(String[] args) {
        Animal s1=new Dog ();
        s1.eat();
    }
}
