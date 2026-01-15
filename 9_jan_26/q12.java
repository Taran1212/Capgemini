import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =2; i <=n; i++){
            boolean isPrime  =false;
            for(int j = 2; j < i; j++){

                if(i % j == 0){
                    isPrime = true;
                    break;
                }
            }

            if(!isPrime)System.out.println(i);
        }
    }
}
