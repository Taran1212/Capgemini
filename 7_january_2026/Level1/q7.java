import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("The number of N Natural number is " + sumOfNNaturalNumbers(n));

    }

    public static int sumOfNNaturalNumbers(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
