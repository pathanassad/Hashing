import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HHMAP {
    public static void main(String[] args)
    {
        // input
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int[] arr = new int[n];

       for(int i =0; i<n; i++)
       {
          arr[i] = sc.nextInt();
       }

       // precompute
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }





       int q = sc.nextInt();
       while(q-- > 0)
       {
           int number = sc.nextInt();
           // fetch
           System.out.println(map.getOrDefault(number, 0));


       }
    }
}
