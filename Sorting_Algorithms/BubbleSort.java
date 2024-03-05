/*  Algorithme principle: 
it compares each pair of adjacent items, and swaps them if they are in the wrong order. 
The pass through the list is repeated until no swaps are needed.
*/
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            swp= false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swp= true;
                }
            }
            if (!swp)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 30, 5, 120, 2,13, 11, 90};
        
        System.out.println("Original array:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();

        bubbleSort(arr); 

        System.out.println("Sorted array:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
