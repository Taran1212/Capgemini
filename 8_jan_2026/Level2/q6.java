import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] result = countVowels(s);
        display(result);
    }

    public static String[][] countVowels(String s) {

        String[][] arr = new String[s.length()][2];

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            arr[i][0] = String.valueOf(ch);

            // Convert uppercase to lowercase using ASCII
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    arr[i][1] = "Vowel";
                    vowels++;
                } else {
                    arr[i][1] = "Consonant";
                    consonants++;
                }
            } else {
                arr[i][1] = "Not a Letter";
            }
        }

        System.out.println("The number of vowels are " + vowels +
                           " and the consonants are " + consonants);

        return arr;
    }

    public static void display(String[][] arr) {
        System.out.println("\nCharacter\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
}
