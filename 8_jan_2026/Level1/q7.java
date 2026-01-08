import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        generateException(s);
        fixException(s);
    }

    public static void generateException(String s) {
        int num = Integer.parseInt(s);
    }

    public static void fixException(String s) {
        try {
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }
}
