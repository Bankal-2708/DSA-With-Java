package Array;
public class Arraybasic {
  // int arr[] = {1,2,3,4,5,6}
  // int arr[] = new int[10];

  public void display(int[] arr){
    for(int i =0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    Arraybasic ab = new Arraybasic();
    // ab.arr = new int[]{1,2,3,4,5,6,7,8,9,10}; 
    int arr[] = {1,2,3,4,5,6,7};

    ab.display(arr);
  }
}
