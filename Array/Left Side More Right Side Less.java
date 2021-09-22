
class Main {
    public static int findElement(int[] array,int n){
        int[] left = new int[n];
        left[0] = Integer.MIN_VALUE;
        
        for(int i=1;i<n;i++){
            left[i] = Math.max(array[i-1],left[i-1]);
        }
        int right = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(array[i]>left[i] && array[i]<right)
            return i;
            right = Math.min(array[i],right);
        }
    return -1;
        
    }
  public static void main(String[] args) {
    int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
              int n = arr.length;
              System.out.println("Index of the element is " +
              findElement(arr, n));    //Write your Code Here
  }
}

/* Try more Inputs

findElement(array, length_of_array)


case1: 
actual = findElement([5, 1, 4, 3, 6, 8, 10, 7, 9],9)
expected = 4

case2: 
actual = findElement([6, 2, 5, 4, 7, 9, 11, 8, 10],9)
expected = 4

case3:
actual = findElement([5, 1, 4, 4],4)
expected = -1

*/