import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        checkNumber(n);

    }

    public static void checkNumber(int a){
        if(a > 0){
            System.out.println("NUmber is positive");
        }else if(a == 0){
            System.out.println("NUmber is zero");
        }else{
            System.out.println("NUmber is negative");
        }
    }
}
