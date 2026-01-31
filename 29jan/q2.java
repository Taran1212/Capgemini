import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000};
        Random r = new Random();

        for (int n : sizes) {
            int[] original = new int[n];
            for (int i = 0; i < n; i++) {
                original[i] = r.nextInt();
            }

            int[] a1 = original.clone();
            int[] a2 = original.clone();
            int[] a3 = original.clone();

            long start = System.nanoTime();
            bubbleSort(a1);
            long bubbleTime = System.nanoTime() - start;

            start = System.nanoTime();
            mergeSort(a2, 0, a2.length - 1);
            long mergeTime = System.nanoTime() - start;

            start = System.nanoTime();
            quickSort(a3, 0, a3.length - 1);
            long quickTime = System.nanoTime() - start;

            System.out.println("Dataset Size: " + n);
            System.out.println("Bubble Sort Time: " + bubbleTime / 1_000_000.0 + " ms");
            System.out.println("Merge Sort Time: " + mergeTime / 1_000_000.0 + " ms");
            System.out.println("Quick Sort Time: " + quickTime / 1_000_000.0 + " ms");
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }
}
