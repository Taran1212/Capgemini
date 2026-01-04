import java.util.*;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        if(number > 0){
            int counter = 1;

            while(counter <= power){
                result *= number;
                counter++;
            }
        }

        System.out.println(result);
    }
}
