public class SecondMax {

  public int getSecondLargest(int[] arr) {
        // code here
        int max = 0;
        int secondmax = 0;
        
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                secondmax = max;
                max = arr[i];
            }else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }
        return secondmax;
    }

  public static void main(String[] args) {
    SecondMax sm = new SecondMax();
    int arr[] = {10,10,10,10};
    System.out.println(sm.getSecondLargest(arr));
  }
  
}
