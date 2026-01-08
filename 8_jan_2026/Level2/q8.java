import java.util.*;

public class q8 {

    public static void main(String[] args) {
        int n = 10;

        int[] ages = generateAges(n);
        String[][] result = checkVotingEligibility(ages);
        display(result);
    }

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] arr = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            arr[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                arr[i][1] = "false";
            } else if (ages[i] >= 18) {
                arr[i][1] = "true";
            } else {
                arr[i][1] = "false";
            }
        }

        return arr;
    }

    public static void display(String[][] arr) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }
}
