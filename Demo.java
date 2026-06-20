class Frequency 
{
    public int find(String str, char ch)
    {
        int count = 0; 
        for (int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        } 
        return count; 
    }
}

public class Demo {
    public static void main(String[] args) {
        
        Frequency freq = new Frequency(); 
        int result = freq.find("Assad", 's'); 
        System.out.println(result); 
        
        
    }
}
