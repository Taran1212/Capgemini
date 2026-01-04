import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int temp = number;

        int result = 0;
        while(temp > 0){
            result += temp % 10;
            temp /= 10;
        }

        if(number % result == 0){
            System.out.println("Harshad");
        }else{
            System.out.println("Not harshad");
        }
    }
}
