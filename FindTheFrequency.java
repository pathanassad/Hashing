import java.util.Scanner;
public class FindTheFrequency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        String str = sc.next(); 
        
        // precompute 
          int[] freqArray = new int[256]; 
          
          for (int i = 0; i<str.length(); i++)
          {
                freqArray[str.charAt(i)]++; 

          } 

          char ch = sc.next().charAt(0);  
          // fetch 
          System.out.println(freqArray[ch]);
        
          sc.close();
    }
}
