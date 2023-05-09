package Zoo;

// Visitor Description Variables
// Private Age
public class Visitor {
    private String name;
    private int age;

    public Visitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter Method for it to be retrievable
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

