import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        int day = sc.nextInt();

        if(springSeason(month, day)){
            System.out.println("It is Spring season");
        }else{
            System.out.println("It is not spring season");
        }

    }

    public static boolean springSeason(String month, int day) {

        if (month.equals("April") || month.equals("May")) {
            return true;
        }else if(month == "March"){
            if(day >= 20 && day <=31){
                return true;
            }
        }else if(month == "June"){
            if(day >= 1 && day <=20){
                return true;
            }
        }

        return false;

    }
}
