package hashmap;
import java.util.*;
public class code1 {
    public static void main(String []args){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        System.out.println(map.get(3));
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(3,0));
        System.out.println(map.containsKey(3));
    }
}
