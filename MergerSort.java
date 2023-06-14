public class MergerSort {
    public static void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void conquere(int arr[], int start, int end, int mid) {
        int merged[] = new int[end - start + 1];
        
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;  
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
        
    }

    public static void divide(int arr[], int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquere(arr, start, end, mid);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 8, 1, 9, 10};
        divide(arr, 0, arr.length - 1);
        //Print elements
        printArray(arr);
    }
}