import java.util.*;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;


        int sumOfFirstNNaturalNumbers = 0;

        while(i <= n){
            sumOfFirstNNaturalNumbers += i;
            i++;
        }

        if(sumOfFirstNNaturalNumbers == (n*(n+1)/2)){
            System.out.println("Correct and the sum is " + sumOfFirstNNaturalNumbers);
        }
    }
}
