import java.util.*;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fee = sc.nextDouble();

        int discountPercent = sc.nextInt();

        double discount = (fee/100) * 10;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee-discount));
    }
}
