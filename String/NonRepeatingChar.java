package String;

public class NonRepeatingChar {

  public int nonRepeating(String str) {
    int[] freq = new int[26];

    char[] arr = str.toCharArray();

    for (char ch : arr) {
      freq[ch - 'a']++;
    }

    for (int i = 0; i < str.length(); i++) {
      if (freq[str.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;

  }

  public static void main(String[] args) {

    String str = "abcdab";
    NonRepeatingChar npc = new NonRepeatingChar();
    System.out.println(npc.nonRepeating(str));

  }
}
