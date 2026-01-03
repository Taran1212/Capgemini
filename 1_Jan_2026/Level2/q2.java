import java.util.*;


public class q2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int yearOfService = sc.nextInt();

        if(yearOfService >= 5){
            salary = salary + ((salary/100)*5);
        }

        System.out.println("The final salary is " + salary);
    }
}