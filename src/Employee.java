public class Employee {

    private String name;
    private String lastName;
    private int salary;

    public Employee(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    double avgSalary(Employee[] employee) {
        int sumSalary = employee[0].getSalary() + employee[1].getSalary() + employee[2].getSalary();
        return sumSalary;
    }

    public void showWorkersList(Employee[] employees) {
        String emp0 = employees[0].getName() + " " + employees[0].getLastName() + " " + employees[0].getSalary();

        String emp1 = employees[1].getName() + " " + employees[1].getLastName() + " " + employees[1].getSalary();

        String emp2 = employees[2].getName() + " " + employees[2].getLastName() + " " + employees[2].getSalary();
        System.out.println(emp0 + " \n" + emp1 + " \n" + emp2);
    }

}
