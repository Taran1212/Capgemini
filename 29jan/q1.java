import java.util.*;

public class q1 {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        int target = -1;
        Random r = new Random();

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = r.nextInt();
            }
            arr[n - 1] = target;

            long start = System.nanoTime();
            linearSearch(arr, target);
            long linearTime = System.nanoTime() - start;

            Arrays.sort(arr);

            start = System.nanoTime();
            binarySearch(arr, target);
            long binaryTime = System.nanoTime() - start;

            System.out.println("Dataset Size: " + n);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println();
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) return m;
            if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
