public class QuickSort {
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; //Taking Higher element as PIVOT
        int i = low - 1; //-1

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++; //Index 0
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //Index of final pivot element
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 1, 6, 7, 3};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        printArray(arr);
    }
}
