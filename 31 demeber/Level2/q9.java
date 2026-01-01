import java.util.*;

public class q9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        int rounds = (side1+side2+side3)/5;

        System.out.println("The total number of rounds the athlete will run is " +  rounds +  " to complete 5 km");
    }
}