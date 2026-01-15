import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = 1;
        int c = a+b;

        int curr = 1;


        System.out.print(a + " " + b + " ");
        for(int i = 0; i < n-2; i++){
            
            System.out.print(c + " ");

            a = b;
            b = c;
            c = a+b;


        }
    }

    
}
