import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int date = sc.nextInt();
        sc.nextLine();
        String month = sc.nextLine();

        if(month.equals("March") && date >= 20 && date <= 31){
            System.out.println("It is spring season");
        }else if(month.equals("April") || month.equals("May")){
            System.out.println("It is spring season");
        }else if(month.equals("June") && date <= 20){
            System.out.println("It is spring season");
        }
    }
}
