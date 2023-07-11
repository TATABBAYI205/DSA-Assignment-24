package Assignment24;

public class UglyNumber 
{
    public static int nthUglyNumber(int n) 
    {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < n; i++) 
        {
            int nextUgly = Math.min(ugly[p2] * 2, Math.min(ugly[p3] * 3, ugly[p5] * 5));
            ugly[i] = nextUgly;
            if (ugly[p2] * 2 == nextUgly) 
            {
                p2++;
            }
            if (ugly[p3] * 3 == nextUgly) 
            {
                p3++;
            }
            if (ugly[p5] * 5 == nextUgly) 
            {
                p5++;
            }
        }
        return ugly[n - 1];
    }
    public static void main(String[] args) 
    {
        int n = 10;
        int result = nthUglyNumber(n);
        System.out.println(result);
    }
}

