package Two_Pointer;

public class TwoSUm {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5, 6, 7 };

    int left = 0;
    int right = arr.length - 1;
    int target = 11;

    for (int i = 0; i < arr.length; i++) {
      int sum = arr[left] + arr[right];

      if (sum == target) {
        System.out.println("Indexes are: " + left + " " + right + " & Elements are: " + arr[left] + " " + arr[right]);
        break;
      }else if (sum < target) {
        left++;
      }else{
        right--;
      }
    }
  }
}
