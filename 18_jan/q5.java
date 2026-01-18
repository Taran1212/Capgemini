public class q5 {

    static class Student{
        static String universityName = "Chitkara";
        static int count;

        String name;
        final int rollNumber;
        char grade;

        static int displayTotalStudent(){
            return count;
        }

        Student(String name, int rollNumber, char grade){
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            count ++;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Taran", 54, 'A');
        Student s2 = new Student("Taran", 54, 'A');
        Student s3 = new Student("Taran", 54, 'A');

        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.grade);

        System.out.println(s1 instanceof Student);
    }
}
