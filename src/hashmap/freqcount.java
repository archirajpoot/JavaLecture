package hashmap;
import java.util.*;
public class freqcount {
    public static void main(String []args){
        HashMap<Integer,Integer> map=new HashMap<>();
        int []arr={1,1,2,3,4,3,5}; //created array
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);

    }
}
