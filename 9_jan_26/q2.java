import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = s.split("\\s+");

        String ans = "";

        for(String str : arr){
            StringBuilder temp = new StringBuilder(str);

            temp.reverse();
            ans += temp + " ";
        }

        System.out.println(ans);

    }
}
