package String;

public class ReverseStr {

  public String revStr(String str) {
    // StringBuilder sb = new StringBuilder();
    char[] arr  = str.toCharArray();
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }

    return new String(arr);
  }

  public static void main(String[] args) {
    String str = "Bankal Mavi";

    // StringBuilder sb = new StringBuilder();

    // for (int i = str.length()-1; i >= 0; i--) {
    // // System.out.println(str.charAt(i));
    // char ch = str.charAt(i);
    // sb.append(ch);
    // }

    ReverseStr rs = new ReverseStr();
    String rev = rs.revStr(str);

    System.out.println(rev);
  }
}
