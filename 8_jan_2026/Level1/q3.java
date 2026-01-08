import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char str[] = s.toCharArray();

        char ans[] = charArray(s);

        if (str.length == ans.length) {
            boolean flag = false;
            for (int i = 0; i < str.length; i++) {
                if (str[i] != ans[i]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("false");
            } else {
                System.out.println("True");
            }
        } else {
            System.out.println("false");
        }

    }

    public static char[] charArray(String s) {

        char res[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            res[i] = s.charAt(i);
        }

        return res;
    }
}