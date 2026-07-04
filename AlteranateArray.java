import java.util.Arrays;

public class AlteranateArray {

  public void display(int[] arr, int[] arr2, int j) {
    for (int i = 0; i < arr.length; i += 2) {
      arr2[j] = arr[i];
      j++;
    }
  }

  public static void main(String[] args) {
    AlteranateArray aa = new AlteranateArray();

    int arr[] = {1,2,3,4,5,6,7,8,9};
    int arr2[] = new int[(arr.length + 1) / 2];
    int j = 0;
  
    aa.display(arr, arr2, j);
    System.out.println(Arrays.toString(arr2));
  }
}