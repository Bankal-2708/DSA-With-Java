package Sliding_Window;

import java.util.HashSet;

public class LongestSubstring {
  public int lengthOfLongestSubstring(String str) {
    int i = 0;
    int maxLen = 0;

    HashSet<Character> set = new HashSet<>();

    for (int j = 0; j < str.length(); j++) {
      char c = str.charAt(j);

      while (set.contains(c)) {
        set.remove(str.charAt(i));
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
