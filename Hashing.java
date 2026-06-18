import java.util.Scanner; 

public class Hashing
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size of array
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];

        // Read array elements

        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Hash Array

        int[] hash = new int[13];

        // count frequency of each number
        for (int i = 0; i < n; i++)
        {
            hash[arr[i]]++;
        }

        // Number of queries
        int q = sc.nextInt();

        while(q-- > 0)
        {
            // Number whose frequency we want
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

        sc.close();
    }
}