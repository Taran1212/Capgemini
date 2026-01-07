public class q12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int)(Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int i : arr) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return new double[]{(double) sum / arr.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] res = findAverageMinMax(arr);

        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        for (double d : res) System.out.println(d);
    }
}
