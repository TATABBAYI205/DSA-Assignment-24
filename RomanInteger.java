package Assignment24;

import java.util.HashMap;

public class RomanInteger 
{
    public static int romanToInt(String s) 
    {
        HashMap<Character, Integer> symbolValues = new HashMap<>();
        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) 
        {
            int currentValue = symbolValues.get(s.charAt(i));
            if (i < n - 1 && currentValue < symbolValues.get(s.charAt(i + 1))) 
            {
                result -= currentValue;
            } 
            else 
            {
                result += currentValue;
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        String s = "LVIII";
        int result = romanToInt(s);
        System.out.println(result);
    }
}

