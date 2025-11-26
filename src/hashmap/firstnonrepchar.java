package hashmap;
import java.util.*;
public class firstnonrepchar {
    public static void main(String []args){
       HashMap<Character,Integer> map=new HashMap<>();
       String str="abcdcsdakb";
        for(char a:str.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println(map);
        for(char a:str.toCharArray()){
            if(map.get(a)==1){
                System.out.println(a);
                break;
            }
        }
    }
}
