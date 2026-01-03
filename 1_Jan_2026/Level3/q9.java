import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int result = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                result += i;
            }
        }

        if(result > number){
            System.out.println("Abundant");
        }else{
            System.out.println("Not abundant");
        }
    }
}
