import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        String str = sc.next(); 
        
        // precompute  
        Map<Character, Integer> map = new HashMap<>(); 
        for(int i = 0; i<str.length(); i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1); 

        } 

        // fetch 

        char ch = sc.next().charAt(0); 
        System.out.println(map.getOrDefault(ch, 0)); 
        
        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue()); 
        }

        sc.close(); 
    }
}