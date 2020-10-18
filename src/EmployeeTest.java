public class EmployeeTest {
    public static void main(String[] args) {


        Employee[] employee = new Employee[3];
        employee[0] = new Employee("Jan", "Kowalski", 3500);
        employee[1] = new Employee("Marek", "Kowal", 5500);
        employee[2] = new Employee("Artur", "Kot", 8500);

        Employee employee2 = new Employee();
        employee2.showWorkersList(employee);
        Employee employee1 = new Employee();
        double avgSalary = employee1.avgSalary(employee);
        System.out.println("To pay " + avgSalary);
    }
}
