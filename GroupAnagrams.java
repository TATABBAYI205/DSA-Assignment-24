package Assignment24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams 
{
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> anagramGroups = new HashMap<>();
        for (String str : strs) 
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (anagramGroups.containsKey(sortedStr)) 
            {
                anagramGroups.get(sortedStr).add(str);
            } 
            else 
            {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                anagramGroups.put(sortedStr, newList);
            }
        }
        return new ArrayList<>(anagramGroups.values());
    }
    public static void main(String[] args) 
    {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}

