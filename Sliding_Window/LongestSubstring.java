package Sliding_Window;

import java.util.HashSet;

public class LongestSubstring {
  public int lengthOfLongestSubstring(String str) {
    int i = 0;  // Left pointer of the sliding window
    int maxLen = 0;

    HashSet<Character> set = new HashSet<>(); // Stores unique characters in the current window

    for (int j = 0; j < str.length(); j++) { // right pointer of sw
      char c = str.charAt(j);

      while (set.contains(c)) { // if duplicate found, keep removing char from left until duplicate is removed
        set.remove(str.charAt(i)); // Remove leftmost character
        i++; 
      }
      set.add(c);
      maxLen = Math.max(maxLen, j - i + 1);

    }
    return maxLen;
  }

  public static void main(String[] args) {
    String str = "abcabcbb";
    LongestSubstring ls = new LongestSubstring();

    System.out.println(ls.lengthOfLongestSubstring(str));
  }
}
