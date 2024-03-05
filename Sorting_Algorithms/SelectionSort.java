/*
 * it divides the input list into two parts , on sorted sublist of items which is built up from left to right
 *  at the front (left) of the list, and an unsorted sublist occupying the rest of the list.
 * The algorithm proceeds by finding the smallest or largest( depending on sorting order) element in the unsorted sublist  and then it will exchang it with the leftmost unsorted element (putting it in sorted order)
 * then it will move the sublist boundaries one element to the right.
 */

public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {63, 35, 2, 112, 91}; 
        System.out.println("Original array:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        selectionSort(arr);
        System.out.println("\nSorted array: ");
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
