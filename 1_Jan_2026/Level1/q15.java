import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact = 1;

        for(int i = n; i>= 2; i--){
            fact *= i;
        }

        System.out.println("The factorial of " + n + " is " + fact);
    }
}
