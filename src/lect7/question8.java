package lect7;
class movie{
    String name;
    double rating;
    int releaseyear;
    movie(String name,double rating,int releaseyear){
        this.name=name;
        this.rating=rating;
        this.releaseyear=releaseyear;
    }
    void displayafter2020(){
        if(releaseyear>2020)
            System.out.println(name+"->"+rating+"->"+releaseyear+"!!");
        else return ;
    }
}
public class question8 {
    public static void main(String[]args){
        // Create a class Movie with name, rating, and releaseYear. Create 5 movie objects and display
        // movies released after 2020.
        movie m1=new movie("saiayara",3,2025);
        movie m2=new movie("pathan",4,2024);
        movie m3=new movie("ashiqi",5,2019);
        movie m4=new movie("housefull",5,2022);
        movie m5=new movie("kgf",5,2015);
        m1.displayafter2020();
        m2.displayafter2020();
        m3.displayafter2020();
        m4.displayafter2020();
        m5.displayafter2020();

    }
}
