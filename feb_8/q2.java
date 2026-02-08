import java.util.*;
import java.util.stream.*;

public class q2 {
    static class Sale {
        int productId;
        int quantity;
        double price;

        Sale(int productId, int quantity, double price) {
            this.productId = productId;
            this.quantity = quantity;
            this.price = price;
        }
    }

    static class ProductSales {
        int productId;
        double totalRevenue;

        ProductSales(int productId, double totalRevenue) {
            this.productId = productId;
            this.totalRevenue = totalRevenue;
        }
    }

    public static void main(String[] args) {
        List<Sale> sales = List.of(
            new Sale(101, 5, 100),
            new Sale(102, 20, 50),
            new Sale(103, 15, 200),
            new Sale(104, 30, 40),
            new Sale(105, 8, 500),
            new Sale(106, 25, 70),
            new Sale(107, 50, 10)
        );

        List<ProductSales> top5 = sales.stream()
                .filter(s -> s.quantity > 10)
                .collect(Collectors.groupingBy(
                        s -> s.productId,
                        Collectors.summingDouble(s -> s.quantity * s.price)
                ))
                .entrySet().stream()
                .map(e -> new ProductSales(e.getKey(), e.getValue()))
                .sorted((a, b) -> Double.compare(b.totalRevenue, a.totalRevenue))
                .limit(5)
                .toList();

        top5.forEach(p -> System.out.println(p.productId + " " + p.totalRevenue));
    }
}
