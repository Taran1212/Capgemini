import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(numberOfHandshake(n));

    }

    public static int numberOfHandshake(int n){
        return (n*(n-1))/2;
    }
}
