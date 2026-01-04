import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        double n = sc.nextDouble();
        while(n != 0){
            total += n;
            n = sc.nextDouble();
        }

        System.out.println(total);
    }    
}
