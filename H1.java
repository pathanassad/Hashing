class Hashing
{
 public void run(int[] arr)
 {
     // pre compute
     int[] hashArray = new int[16];
     for (int i = 0; i<arr.length; i++)
     {
         hashArray[arr[i]]++;
     }

    // fetch
     for (int i = 0; i<hashArray.length; i++)
     {
         if(hashArray[i] > 0)
         {
             System.out.println(i + " Occurs " + hashArray[i] + " times");
         }
     }


 }
}


public class H1
{
public static void main(String[] args)
{
    int[] arr = {10, 5, 10, 15, 10, 5};
    Hashing hash = new Hashing();
    hash.run(arr);

}
}