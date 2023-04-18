import java.util.Random;
import java.util.Scanner;

class FlamesHope {
    public static void main(String[] args) {
        System.out.println("Welcome to Flames Hope!");
        Scanner myScanner = new Scanner(System.in);

        // Input User's Name
        System.out.print("What's your name: ");
        String name = myScanner.nextLine();

        // Error Checking: No Input (ITEM #1)
        if(name.isEmpty()) {
            System.out.println("Your name is required!");
            System.exit(0);
        }

        // Input Crush's Name
        System.out.print("What's your Crush's name: ");
        String crushName = myScanner.nextLine();
        
        // Error Checking: No Input (ITEM #2)
        if(crushName.isEmpty()) {
            System.out.println("Your Crush's name is required!");
            System.exit(0);
        }

        int nameLength = name.length();                 // Gets Name Length (ITEM #3)
        int crushNameLength = crushName.length();       // Gets CrushName Length (ITEM #4 )
        int result = result(nameLength, crushNameLength);

        // Displays Result
        System.out.println("Your compatibility result: " + result);

        // Results Conditions (ITEM #5)
        if(result < 50){
            System.out.println("SAD :(");
        }else{
           System.out.println(name + " and " + crushName + " is <3");
        }
    }

    static int result(int nameLength, int crushNameLength) {
        int total = nameLength + crushNameLength;
        Random random = new Random();
        return random.nextInt(total - 1) + 1;
    }
}