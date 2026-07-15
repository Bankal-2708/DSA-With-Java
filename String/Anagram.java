package String;

 
public class Anagram {

  public boolean anagram(String str1, String str2){

    if (str1.length() != str2.length()) {
      return false;
    }

    int[] freq = new int[26];

    for (int i = 0; i < str1.length(); i++) {
      freq[str1.charAt(i) - 'a']++; // 1 str inc freq of char in freq array
      freq[str2.charAt(i) - 'a']--; // second str make that freq 0 of tha same char 
    }

    for (int f : freq) {
      if (f != 0) {
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    Anagram an = new Anagram();

    String str1= "abcd";
    String str2 = "bcda";

    System.out.println(an.anagram(str1, str2));
  }
}
