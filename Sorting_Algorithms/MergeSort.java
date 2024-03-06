/*
Merge Sort – The merge sort is a divide and conquer technique that divides a bigger problem into two sub-problems, and each sub-problem is further addressed separately. 
The out of the program is formed by combining all the results of each sub-problems.
*/


public class MergeSort {

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        int arr[] = {38, 27, 30, 31, 90, 82,10, 10};
        System.out.println("Array origin:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting:");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
