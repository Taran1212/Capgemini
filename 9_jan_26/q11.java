import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;

        int n = sc.nextInt();

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Yes it is");
        }else{
            System.out.println("No");
        }
    }
}
