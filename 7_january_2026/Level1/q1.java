import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        System.out.println(simpleInterest(principle, rate, time));

    }

    public static int simpleInterest(int principle, int rate, int time){
        return (principle*rate*time)/100;
    }
}
