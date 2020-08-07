/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 

*/



import java.util.*;

public class longestSubSpecial {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, count = 0, res = 0;
        Map<Character, Character> map = new HashMap<Character, Character>();
        while(j < s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), s.charAt(j));
                j++;
                count++;
            }
            else{
                map.remove(s.charAt(i));
                count--;
                i++;
            }
            
                res = Math.max(res, count);
        }
        return res;
    }
}