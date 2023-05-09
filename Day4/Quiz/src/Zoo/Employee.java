package Zoo;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter Method for retrieving salary
    private int getSalary() {
        return salary;
    }

    public void feedAnimal(Animal animal) {
        // implementation here
    }
}

