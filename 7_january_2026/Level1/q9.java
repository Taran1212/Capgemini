import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int arr[] = findRemainderAndQuotient(number1, number2);

        System.out.println("The remainder is " + arr[0] + " and the quoitent is " + arr[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor){

        int rem = number % divisor;
        int quotient = number/divisor;

        return new int[]{rem,quotient};
    }
}
