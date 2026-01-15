import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp  = n;
        int res = 0;

        while(temp > 0){
            res += (int)Math.pow(temp%10,3);

            temp /= 10;
        }

        if(res == n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }


    }
}
