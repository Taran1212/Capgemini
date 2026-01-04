import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int i = number;

        int digits = 0;
        while(i > 0){
            digits ++;
            i /= 10;
        }

        System.out.println(digits);
    }
}
