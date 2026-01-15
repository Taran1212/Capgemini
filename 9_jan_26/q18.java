import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();

        int n = Integer.parseInt(binary,2);

        String res = Integer.toBinaryString(n);

        System.out.println("The string to decimal is " + n + " and to binary is " + res);


    }
}
