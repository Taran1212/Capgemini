import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Yes you can vote");
        }else{
            System.out.println("No you are not eligible for voting");
        }
    }
}
