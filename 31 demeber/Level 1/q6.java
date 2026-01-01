public class q6 {
    public static void main(String[] args) {
        int fee = 12500;

        int discountPercent = 10;

        int discount = (12500/100) * 10;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee-discount));
    }
}
