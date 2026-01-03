import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int avg = (physics + chemistry + maths)/3;

        if(avg >= 80 && avg <= 100){
            System.out.println("A");
        }else if(avg >= 70 && avg < 80){
            System.out.println("B");
        }
        else if(avg >= 60 && avg < 70){
            System.out.println("C");
        }
        else if(avg >= 50 && avg < 60){
            System.out.println("D");
        }
        else if(avg >= 40 && avg < 50){
            System.out.println("E");
        }else{
            System.out.println("R");
        }
    }
}
