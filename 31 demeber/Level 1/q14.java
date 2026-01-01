import java.util.*;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceInFeet = sc.nextInt();

        double yards = distanceInFeet/3;
        double miles = yards/1760;

        System.out.println("Your Height in yards is " + yards + " while in miles is " + miles  + " for the given input in feet "+ distanceInFeet);


    }
}
