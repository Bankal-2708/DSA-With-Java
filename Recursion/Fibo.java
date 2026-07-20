package Recursion;

public class Fibo {
  public int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    return fib(n - 1) + fib(n - 2);
  }

  public static void main(String[] args) {
    Fibo fib = new Fibo();
    // System.out.println(fib.fib(5));
    int n = 10;
    for (int i = 0; i < n; i++) {
      System.out.println(fib.fib(i) + " ");
    }
  }
}
