package Assignment24;

import java.util.HashSet;

public class SubStringNoRepeateChar 
{
    public static int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (end < n) 
        {
            char currentChar = s.charAt(end);
            if (!set.contains(currentChar)) 
            {
                set.add(currentChar);
                end++;
                maxLength = Math.max(maxLength, end - start);
            } 
            else 
            {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) 
    {
        String s = "bbbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}

