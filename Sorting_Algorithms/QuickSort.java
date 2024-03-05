/*
 * Quick Sort is a highly efficient sorting algorithm .
 * it  follows the divide and conquer strategy:
 Algorithm: it select  a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot.
  The sub-arrays are then sorted recursively. This process leads to the quick sort's ability to sort the list more efficiently than many other sorting algorithms.
 * 
 */


public class QuickSort {

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = {12, 10, 11, 2, 90, 5};
        
        System.out.println("Original array:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1); 

        System.out.println("Sorted array:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}

