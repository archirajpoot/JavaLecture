package hashmap;
import java.util.HashMap;
public class targetsum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff=target-arr[i];

            if (map.containsKey(diff)) {
                System.out.println("Pair found at: " +i+ "and" + map.get(diff) );
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(map);
    }}