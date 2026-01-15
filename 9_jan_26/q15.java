import java.util.HashSet;
import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Character> h1 = new HashSet<>();

        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            if(h1.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
            }else{
                h1.add(s.charAt(i));
            }
        }
    }
}
