package Zoo;

public class Manager {
    private String name;
    private int age;
    private String initialTitle;

    public Manager(String name, int age, String initialTitle) {
        this.name = name;
        this.age = age;
        this.initialTitle = initialTitle;
    }

    // Method for Manager to view Employee Salary
    public void viewEmployeeSalary(Employee employee) {
        int salary = employee.getSalary();
    }
}
