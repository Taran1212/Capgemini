import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int amarHeight = sc.nextInt();

        int akbarAge = sc.nextInt();
        int akbarHeight = sc.nextInt();

        int anthonyAge = sc.nextInt();
        int anthonyHeight = sc.nextInt();

        if(akbarAge >= amarAge && akbarAge >= anthonyAge){
            System.out.println("Akbar is the oldest");
        }else if(amarAge >= akbarAge && amarAge >= anthonyAge){
            System.out.println("Amar is the oldest");
        }else{
            System.out.println("Anthony is the oldest");
        }

        if(akbarHeight >= amarHeight && akbarHeight >= anthonyHeight){
            System.out.println("Akbar is the tallest");
        }else if(amarHeight >= akbarHeight && amarHeight >= anthonyHeight){
            System.out.println("Amar is the tallest");
        }else{
            System.out.println("Anthony is the tallest");
        }
    }
}
