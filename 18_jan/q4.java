public class q4 {

    static class Product {
        static int discount = 10;

        String productName;
        int price;
        int quantity;

        final int productId;

        static void updateDiscount(int discount) {
            Product.discount = discount;
        }

        Product(String productName, int price, int quantity, int productId) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
            this.productId = productId;
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000, 2, 101);

        Product.updateDiscount(15);

            System.out.println(Product.discount);
            System.out.println(p1.productName);
            System.out.println(p1.price);
            System.out.println(p1.quantity);
            System.out.println(p1.productId);

            System.out.println(p1 instanceof Product);
        
    }
}
