public class SelectionSort {
    /* Selection Sort function */
    public static void sort(int arr[]){
        int N = arr.length;
        int i, j = 0, pos, temp;
        for (i = 0; i < N; i++) {
            for (j = i+1; j < N; j++) {
            	pos = j;
                if (arr[i] > arr[pos]) {
                    pos = j;
                    temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
      }
}
