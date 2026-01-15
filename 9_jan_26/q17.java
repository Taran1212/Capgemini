import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String res = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
                continue;
            }

            res += ch;
        }

        System.out.println(res);


    }
}
