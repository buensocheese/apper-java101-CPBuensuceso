public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        dataType();
        method();
        loopTest();
    }
    //Data Types Test
    public static void dataType() {
        // Integer Data Types
        byte b = 127; // 1 byte
        short s = 32767; // 2 bytes
        int i = 2147483647; // 4 bytes
        long l = 9223372036854775807L; // 8 bytes

        // Floating-point Data Types
        float f = 3.141592653589793238f; // 4 bytes
        double d = 3.141592653589793238; // 8 bytes

        // Character Data Type
        char c = 'A'; // 2 bytes

        // Boolean Data Type
        boolean bool = true; // 1 bit

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
    }
    //Notes on Data Types
    //- Different data types can be mixed together but data type of variable holder should be the same as largest bit
    //  of data type

    //Variable Naming
    //- camelCase: for naming variables
    //- SNAKE_CASE: for use when all caps or use when STATIC VARIABLE naming

    //IntelliJ Hacks
    //- Refactor: Introduce Variables
    //- CTRL + Click: --help
    //- CTRL + /: Block Comment

    //Method Test
    public static void method() {
        System.out.println("Test");
    }

    //Loop Test
    public static void loopTest(){
        // For loop example
        System.out.println("For loop example:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While loop example
        System.out.println("While loop example:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // Do-while loop example
        System.out.println("Do-while loop example:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
    }
}