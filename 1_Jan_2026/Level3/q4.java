import java.util.*;

public class q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean isPrime = false;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = true;
                break;
            }
        }

        if(isPrime){
            System.out.println("The number is not prime");
        }else{
            System.out.println("The number is prime");
        }
    }
}