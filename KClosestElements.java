package Assignment24;

import java.util.ArrayList;
import java.util.List;

public class KClosestElements 
{
    public static List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        int left = 0;
        int right = arr.length - 1;
        while (right - left >= k) 
        {
            int diffLeft = Math.abs(arr[left] - x);
            int diffRight = Math.abs(arr[right] - x);
            if (diffLeft >= diffRight) 
            {
                left++;
            } 
            else 
            {
                right--;
            }
        }
        List<Integer> closestElements = new ArrayList<>();
        for (int i = left; i <= right; i++) 
        {
            closestElements.add(arr[i]);
        }
        return closestElements;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> result = findClosestElements(arr, k, x);
        System.out.println(result);
    }
}

