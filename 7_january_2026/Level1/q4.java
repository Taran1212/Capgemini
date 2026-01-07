import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        
        System.out.println("The number of rounds to complete 5km are " + noOfRounds(side1, side2, side3));

    }

    public static double noOfRounds(int side1, int side2, int side3){
        int perimeter = side1 + side2 + side3;

        return 5000.0/perimeter;
    }
}
