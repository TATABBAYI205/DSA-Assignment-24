package Assignment24;

import java.util.*;

public class SlidingWindowMax 
{
    public static int[] maxSlidingWindow(int[] nums, int k) 
    {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> maxSlidingWindow = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
        {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) 
            {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) 
            {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) 
            {
                maxSlidingWindow.add(nums[deque.peekFirst()]);
            }
        }
        int[] result = new int[maxSlidingWindow.size()];
        for (int i = 0; i < maxSlidingWindow.size(); i++) 
        {
            result[i] = maxSlidingWindow.get(i);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }
}

