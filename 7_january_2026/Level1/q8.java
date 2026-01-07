import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int arr[] = findSmallestAndLargest(number1, number2, number3);

        System.out.println("The smallest is " + arr[0] + " and the largest is " + arr[1]);
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));

        return new int[] { smallest, largest };
    }
}
