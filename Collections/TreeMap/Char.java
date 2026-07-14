package Collections.TreeMap;

import java.util.TreeMap;

public class Char {
  public static void main(String[] args) {
    String word = "banana";
    TreeMap<Character, Integer> counts = new TreeMap<>();

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);

      if (counts.containsKey(c)) {

        counts.put(c, counts.get(c) + 1);

      } else {

        counts.put(c, 1);

      }
      // counts.put(c, counts.getOrDefault(c, 0) + 1);
    }
    System.out.println(counts);
  }
}
