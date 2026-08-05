class Solution {
    public String removeDuplicates(String s) {
        char[] arr =  s.toCharArray(); // convert sting to arr
        int top = -1; // took a pointer 

        for (int i = 0; i < arr.length; i++) {
            if (top >= 0 && arr[top] == arr[i]) { // chek id duplicate occur
                top--;  // remove it
            }else {
                top++; // if no then move 1 top and store arr[i]
                arr[top] = arr[i];
            }
        }
        return new String(arr,0,top+1);
    }
}