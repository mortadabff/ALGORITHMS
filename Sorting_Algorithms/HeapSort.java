/*
Heap – A heap is an abstract data type categorised into max-heap and min-heap. 
For all nodes in a heap, if the root node is greater than its children, it is referred to as 
the max-heap; if the root node is smaller than its children, it is referred to as the min-heap.

Heap Sort - A heap sort is also based on the comparison and selection method. It considers the given
 array as a heap, converts it into max-heap or min-heap, and then sorts the array by 
selecting and eliminating.

*/
public class HeapSort {

    public static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 110, 13, 50, 60, 61};
        System.out.println("Array origin:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Array after sorting:");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
