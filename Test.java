public class Test
{
    public static int findCount(int n, int[] numbers)
    {
        int count = 0;
        for (int i = 0; i<numbers.length; i++)
        {
            if (n==numbers[i])
                count++;
        }

        return count;
    }
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 2, 1, 1, 5, 6};
        int result = findCount(1, numbers);
        System.out.println("Number is appearing " + result + " times");

    }
}