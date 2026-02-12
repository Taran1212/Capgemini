import java.util.Arrays;
import java.util.List;

class Main {

    static class Student {
        String name;
        int age;
        List<String> subjects;

        Student(String name, int age, List<String> subjects) {
            this.name = name;
            this.age = age;
            this.subjects = subjects;
        }

        String toJson() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"name\":\"").append(name).append("\",");
            sb.append("\"age\":").append(age).append(",");
            sb.append("\"subjects\":[");
            for (int i = 0; i < subjects.size(); i++) {
                sb.append("\"").append(subjects.get(i)).append("\"");
                if (i < subjects.size() - 1) sb.append(",");
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Student student = new Student(
                "Alex Johnson",
                20,
                Arrays.asList("Math", "Computer Science", "History")
        );

        System.out.println(student.toJson());
    }
}
