import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int res = 0;

        while(temp > 0){
            res = (res*10) + temp%10;
            temp /= 10;
        }

        if(res == n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
