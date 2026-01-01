import java.util.*;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfChildren = sc.nextInt();
        int numOfChocolates = sc.nextInt();

        int chocolatesDistributed = numOfChocolates%3;
        int chocolatesRemaining = numOfChocolates - (chocolatesDistributed*3);

        System.out.println("The Pen Per Student is " + chocolatesDistributed + " and the remaining pen not distributed is " + chocolatesRemaining);
    }
}
