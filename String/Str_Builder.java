package String;

// fast for operation  it doe not create new string  it is a immutable 

public class Str_Builder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    String str = "Bankal Mavi";

    for (int i = 0; i < str.length(); i++) {
      sb.append(str.charAt(i));
    }
    System.out.println(sb);
    System.out.println(sb.reverse());
  }
}
