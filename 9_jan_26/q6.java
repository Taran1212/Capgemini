import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        int temp = n;

        while(temp > 0){
            sum += temp%10;
            temp /= 10;
        }
        
        System.out.println(sum);
    }
}
