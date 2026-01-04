import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The first number is the largest");
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("Second number is the largest");
        }else{
            System.out.println("the third number is the largest");
        }
    }
}
