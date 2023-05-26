// Interface defining common behavior for animals
interface Animal {
    void eat();
    void sleep();
}

// Concrete class implementing the Animal interface
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }
}

// Application class
public class App {
    public static void main(String[] args) {
        // Create a Cat object
        Cat cat = new Cat();

        // Call the eat and sleep methods on the Cat object
        cat.eat();
        cat.sleep();
    }
}
