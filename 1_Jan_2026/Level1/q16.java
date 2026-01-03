import java.util.*;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int i = 1;

        while(i <= num){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is odd");
            }

            i++;
        }
    }
}
