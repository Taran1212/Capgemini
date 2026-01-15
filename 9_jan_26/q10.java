import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;

        for(int i = Math.min(a,b); i > 1; i--){
            if(a % i == 0 && b % i == 0){
                hcf = i;
                break;
            }
        }

        int lcm = (a*b)/hcf;

        System.out.println("The HCF is " + hcf + " and the LCM is " + lcm);
    }
}
