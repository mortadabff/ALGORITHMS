/*
Insertion Sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.

*/
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {63, 35, 2, 112, 91}; 
        System.out.println("Original array:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        insertionSort(arr);
        System.out.println("\nSorted array: ");
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
