import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sumOfFirstNNaturalNumbers = 0;

        for(int i = 1; i <= n; i++){
            sumOfFirstNNaturalNumbers += i;
        }

        if (sumOfFirstNNaturalNumbers == (n * (n + 1) / 2)) {
            System.out.println("Correct and the sum is " + sumOfFirstNNaturalNumbers);
        }
    }
}
