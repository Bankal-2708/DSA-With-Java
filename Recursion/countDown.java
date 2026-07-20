package Recursion;

public class countDown {
  public void count(int n) {
    if (n == 0) {
      System.out.println("Time Up : Stop");
      return;
    }
    System.out.println(n);
    count(n - 1);
  }

  public static void main(String[] args) {
    countDown cd = new countDown();
    cd.count(10);
  }
}
