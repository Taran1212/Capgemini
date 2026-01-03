import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first = sc.nextDouble();
        double second = sc.nextDouble();
        sc.nextLine();
        String op = sc.nextLine();

        switch(op){
            case "+":
                System.out.println(first+second);
                break;

            case "-":
                System.out.println(first-second);
                break;

            case "*":
                System.out.println(first*second);
                break;

            case "/":
                System.out.println(first/second);
                break;

            default:
                System.out.println("Invalid Operator");
                
        }
    }
}
