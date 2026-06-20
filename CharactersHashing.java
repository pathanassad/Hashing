import java.util.Scanner;

public class CharactersHashing {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine(); 


       // precompute  
         int[] hashArray = new int[26];
         for (int i = 0; i<str.length(); i++)
         {
             hashArray[str.charAt(i) - 'a']++; 
         }

        int q = sc.nextInt(); 

        while (q-- > 0) { 
            
            char ch = sc.next().charAt(0); 
            
            // fetch 
            System.out.println(hashArray[ch - 'a']);


            
        }  
        sc.close(); 


    }
}
