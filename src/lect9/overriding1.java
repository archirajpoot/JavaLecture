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
        Animal s1=new Dog (); // if uppercasting is used then we can only acess the method
        // which is in the parent class or in the both class or when the method is overridden
        // and if we have to acesss
        // than we will use down casting it is like the typecasting in datatype

        s1.eat();
    }
}
