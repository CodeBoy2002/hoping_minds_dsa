public class SortingAlgo {

    public static void printArray(int[] num) {
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 1, 8, 9, 10};

        //Bubble Sort
        //Time Complexity = O(N^2)
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //Selection Sort
        // Time complexity = O(N^2)
        for(int i = 0; i < arr.length; i++) {
            int smallest = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        //Insertion Sort
        //Time Complexity O(N^2)
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
        

        printArray(arr);
    }
}
