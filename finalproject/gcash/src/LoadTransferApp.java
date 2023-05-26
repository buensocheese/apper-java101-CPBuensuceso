import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoadTransferApp {
    private static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        initializeUsers();
        showMainMenu();
    }

    // Pre-registered Users
    private static void initializeUsers() {
        users.put("09175861661", new User("09175861661", "Bob"));
        users.put("09175861662", new User("09175861662", "Marley"));
        users.put("09175861663", new User("09175861663", "Seth"));
        users.put("09175861664", new User("09175861664", "Ryan"));
        users.put("09175861665", new User("09175861665", "Fritz"));
    }

    // Main Console Menu
    private static void showMainMenu() {
        clearConsole();
        System.out.println("Main Menu");
        System.out.println("Press 0 to View Load Balances");
        System.out.println("Press 1 to Register a New Account");
        System.out.println("Press 2 to Transfer Load Balance");
        System.out.println("Press 3 to Exit and Close the App");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                viewLoadBalances();
                break;
            case 1:
                registerNewAccount();
                break;
            case 2:
                transferLoadBalance();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option! Please choose a valid option.");
                clearConsole();
                showMainMenu();
                break;
        }
    }

    // Clear Console
    private static void clearConsole() {
        // Clear console output
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Clear Console with Delay
    private static void clearConsoleDelay() {
        try {
            Thread.sleep(1000); // Add a 1-second delay
            System.out.print("\033[H\033[2J"); // Clear console output (works on most systems)
            System.out.flush();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // Case 1: View Balance
    private static void viewLoadBalances() {
        clearConsole();
        System.out.println("Registered Users:");
        for (User user : users.values()) {
            System.out.printf("%s : %s : %.2f\n", user.getPhoneNumber(), user.getUsername(), user.getLoadBalance());
        }
        System.out.println("\nPress 0 to Go Back to Main Menu");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 0) {
            showMainMenu();
        } else {
            viewLoadBalances();
        }
    }

    // Case 2: Register New User
    private static void registerNewAccount() {
        clearConsole();
        System.out.println("Registration");

        // Input Name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the USERNAME: ");
        String username = scanner.nextLine();

        // Error Check
        if (username.isBlank()) {
            System.out.println("Error: Username cannot be blank!");
            clearConsoleDelay();
            registerNewAccount();
            return;
        }

        for (User user : users.values()) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                System.out.println("Error: Username already exists!");
                clearConsoleDelay();
                registerNewAccount();
                return;
            }
        }

        // Input Number

        System.out.print("Enter the PHONE NUMBER: ");
        String phoneNumber = scanner.nextLine();

        // Error Check
        if (!phoneNumber.matches("^09\\d{9}$")) {
            System.out.println("Error: Invalid phone number format! It should start with '09' and have 11 digits.");
            clearConsoleDelay();
            registerNewAccount();
            return;
        }

        if (users.containsKey(phoneNumber)) {
            System.out.println("Error: Phone number is already registered!");
            clearConsoleDelay();
            registerNewAccount();
            return;
        }

        // Successful Registration
        users.put(phoneNumber, new User(phoneNumber, username));
        System.out.println("\nAccount Successfully Registered!");
        System.out.println("Press 0 to Go Back to Main Menu");

        int choice = scanner.nextInt();
        if (choice == 0) {
            showMainMenu();
        } else {
            registerNewAccount();
        }
    }

    // Case 3: Transfer Load Balance
    private static void transferLoadBalance() {
        clearConsole();
        System.out.println("Load Balance Transfer");

        // Input Number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Sender's PHONE NUMBER: ");
        String senderPhoneNumber = scanner.nextLine();

        // Error Check: Phone Number
        if (!users.containsKey(senderPhoneNumber)) {
            System.out.println("Error: Sender's phone number is not registered!");
            clearConsoleDelay();
            transferLoadBalance();
            return;
        }

        // Input Number
        System.out.print("Enter the Recipient's PHONE NUMBER: ");
        String recipientPhoneNumber = scanner.nextLine();

        // Error Check: Phone Number
        if (!users.containsKey(recipientPhoneNumber)) {
            System.out.println("Error: Recipient's phone number is not registered!");
            clearConsoleDelay();
            transferLoadBalance();
            return;
        }

        if (senderPhoneNumber.equals(recipientPhoneNumber)) {
            System.out.println("Error: Sender and recipient phone numbers cannot be the same!");
            clearConsoleDelay();
            transferLoadBalance();
            return;
        }

        User sender = users.get(senderPhoneNumber);

        System.out.print("Enter the amount of LOAD BALANCE to transfer: ");
        double amount = scanner.nextDouble();

        // Error Check: Insufficient Balance
        if (amount > sender.getLoadBalance()) {
            System.out.println("Error: Insufficient load balance for the transfer!");
            clearConsoleDelay();
            transferLoadBalance();
            return;
        }

        // Update Load Balance
        User recipient = users.get(recipientPhoneNumber);
        sender.setLoadBalance(sender.getLoadBalance() - amount);
        recipient.setLoadBalance(recipient.getLoadBalance() + amount);

        System.out.println("\nTransaction Completed!\n");

        // Display Updated Balance
        System.out.println("Updated Load Balances:");
        for (User user : users.values()) {
            System.out.printf("%s : %s : %.2f\n", user.getPhoneNumber(), user.getUsername(), user.getLoadBalance());
        }

        System.out.println("\nPress 0 to Go Back to Main Menu");

        int choice = scanner.nextInt();
        if (choice == 0) {
            showMainMenu();
        } else {
            transferLoadBalance();
        }
    }
}
