package Assignment24;

import java.util.*;

public class FrequentWords 
{
    public static List<String> topKFrequent(String[] words, int k) 
    {
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) 
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> wordCount.get(a).equals(wordCount.get(b)) ? b.compareTo(a) : wordCount.get(a) - wordCount.get(b));
        for (String word : wordCount.keySet()) 
        {
            pq.offer(word);
            if (pq.size() > k) 
            {
                pq.poll();
            }
        }
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) 
        {
            result.add(0, pq.poll());
        }
        return result;
    }
    public static void main(String[] args) 
    {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> result = topKFrequent(words, k);
        System.out.println(result);
    }
}

