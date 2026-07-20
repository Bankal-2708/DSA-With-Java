package Recursion;

public class SumOfN {

  public int sum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sum(n - 1);

  }

  public static void main(String[] args) {
    SumOfN sn = new SumOfN();
    System.out.println(sn.sum(5));
  }
}

/*
 * sum(5) = 5 + sum(4)
 * = 5 + (4 + sum(3))
 * = 5 + (4 + (3 + sum(2)))
 * = 5 + (4 + (3 + (2 + sum(1))))
 * = 5 + (4 + (3 + (2 + (1 + sum(0)))))
 * = 5 + (4 + (3 + (2 + (1 + 0))))
 * = 5 + 4 + 3 + 2 + 1 + 0
 * = 15
 */