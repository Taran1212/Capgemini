import java.util.*;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character,Integer> h1 = new HashMap<>();

        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i), 0)+1);
        }

        for(Map.Entry<Character,Integer> e1 : h1.entrySet()){
            System.out.print(e1.getKey() + " -> " + e1.getValue() + " ");
        }
    }
}
