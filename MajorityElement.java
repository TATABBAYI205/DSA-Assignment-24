package Assignment24;

public class MajorityElement 
{
    public static int findMajorityElement(int[] nums) 
    {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] == candidate) 
            {
                count++;
            } 
            else 
            {
                count--;
                if (count == 0) 
                {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        int occurrences = 0;
        for (int num : nums) 
        {
            if (num == candidate) 
            {
                occurrences++;
            }
        }
        if (occurrences > nums.length / 2) 
        {
            return candidate;
        } 
        else 
        {
            return -1; 
        }
    }
    public static void main(String[] args) 
    {
        int[] nums = {3, 2, 3};
        int result = findMajorityElement(nums);
        System.out.println(result);
    }
}

