import java.util.*;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        if(number > 0){
            int i = 1;

            while(i <= power){
                result *= number;
                i++;
            }
        }

        System.out.println(result);
    }
}
