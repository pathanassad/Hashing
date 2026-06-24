import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Helper
{
    public void helper(int[] arr)
    {
        //precompute
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // fetch
      Map.Entry<Integer, Integer>  maxEntry =  map.entrySet()
              .stream()
              .max(Map.Entry.comparingByValue())
              .orElseThrow(); // throws exception if empty

      Map.Entry<Integer, Integer> minEntry = map.entrySet()
              .stream()
              .min(Map.Entry.comparingByValue())
              .orElseThrow();

        System.out.println(maxEntry.getKey() + " " + minEntry.getKey());

    }
}

public class H2
{
    public static void main(String[] args)
    {
        int[] arr = {10,5,10,15,10,5};
        Helper help = new Helper();
        help.helper(arr);
    }
}