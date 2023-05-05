//Notes for Java 101 Day 3
public class Main {

    //Global Variable
    // - can be accessed by any method in a class
    int globalVariable; // declaring a global variable

    public void SetGlobalVariable() {
        globalVariable = 10; // accessing the global variable in a method
    }

    //Zero Values
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;
    static boolean myBoolean;
    static Object myObject;

    public static void main(String[] args) {
        System.out.println("byte: " + myByte); // prints 0
        System.out.println("short: " + myShort); // prints 0
        System.out.println("int: " + myInt); // prints 0
        System.out.println("long: " + myLong); // prints 0
        System.out.println("float: " + myFloat); // prints 0.0
        System.out.println("double: " + myDouble); // prints 0.0
        System.out.println("char: " + myChar); // prints '\u0000'
        System.out.println("boolean: " + myBoolean); // prints false
        System.out.println("object: " + myObject); // prints null


        //Math Operations
        int a = 10;
        int b = 5;
        int c = 2;

        // PEMDAS: 10 * 5 = 50, 50 + 2 = 52
        int result1 = a * b + c; // result1 is 52
        System.out.println("Result 1: " + result1);

        // PEMDAS: 10 / 5 = 2, 2 + 2 = 4, 4 * 3 = 12
        int result2 = a / b + c * 3; // result2 is 12
        System.out.println("Result 2: " + result2);

        // PEMDAS: 10 * (5 - 2) = 30, 30 + 2 = 32
        int result3 = a * (b - c) + c; // result3 is 32
        System.out.println("Result 3: " + result3);

        // PEMDAS: 10 / (5 + 2) = 1, 1 + 2 = 3, 3 * 2 = 6
        int result4 = a / (b + c) * 2; // result4 is 6
        System.out.println("Result 4: " + result4);


        //Prefix vs Suffix Operations
        int x = 5;
        int y = ++x;
        System.out.println("x is " + x); // output: x is 6
        System.out.println("y is " + y); // output: y is 6

        int w = 5;
        int z = w++;
        System.out.println("w is " + w); // output: x is 6
        System.out.println("z is " + z); // output: y is 5



        //Switch Case

        String animal = "cat";

        switch (animal) {
            case "dog":
                System.out.println("Woof!");
                break;
            case "cat":
                System.out.println("Meow!");
                break;
            case "cow":
                System.out.println("Moo!");
                break;
            case "duck":
                System.out.println("Quack!");
                break;
            default:
                System.out.println("Unknown animal");
        }

        Animal animals = Animal.DOG;
        System.out.println(animals.getSound()); // prints "woof"

    }

    //enum example
    public enum Animal {
        DOG("woof"),
        CAT("meow"),
        COW("moo"),
        BIRD("chirp");

        private String sound;

        private Animal(String sound) {
            this.sound = sound;
        }

        public String getSound() {
            return this.sound;
        }
    }

}