// import java.util.*;

class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == Math.floor(b)) {
                return true;
            }
        }
        return false;
    }

}