import java.util.*;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();

        int total = unitPrice*quantity;

        System.out.println("The total purchase price is INR " + unitPrice + " if the quantity " + quantity + " and unit price is INR " + total);
    }
}
