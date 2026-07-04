import java.util.Arrays;

public class ReverseArray {
  public void reverse(int[] arr, int left, int right) {
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
  }

  public static void main(String[] args) {
    ReverseArray ra = new ReverseArray();
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int left = 0;
    int right = arr.length - 1;

    ra.reverse(arr, left, right);

    System.out.println(Arrays.toString(arr));
  }
}
