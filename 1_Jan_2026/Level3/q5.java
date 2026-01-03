import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        int temp = number;


        int result = 0;
        while(temp > 0){
            result += Math.pow((temp%10),3);
            temp /= 10;
        }

        if(result == number){
            System.out.println("is Armstrong number");
        }else{
            System.out.println("Not armstrong");
        }
    }
}
