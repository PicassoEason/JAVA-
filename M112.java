import java.util.HashMap;
import java.util.Map;

public class M112 {
    public static void main(String[] args) {
        
    }
    public Boolean sumsToTarget(Integer[] arr, Integer target) {
          Map<Integer, Integer> numMap = new HashMap<>();
          for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (numMap.containsKey(complement)) {
              return true;
            } else {
              numMap.put(arr[i], i);
            }
          }
        return false;
    }
}
