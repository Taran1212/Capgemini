public class q3 {

    static class Employee{
        static String companyName;
        static int count;

        String name;
        final int id;
        String designation;

        static int displayTotalEmployees(){
            return count;
        }

        Employee(String name, int id, String designation){
            this.name = name;
            this.id = id;
            this.designation = designation;
            count ++;
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Taran", 123, "SDE");
        Employee e2 = new Employee("Taran", 125, "Manager");
        Employee e3 = new Employee("Taran", 124, "SDE");

        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.designation);

        System.out.println(Employee.displayTotalEmployees());
        System.out.println(e1 instanceof Employee);
    }
}
