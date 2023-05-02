import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean testAgain = true;

        //For multiple testing without running the code again
        while (testAgain) {
            int number = 0;
            boolean isValidInput = false;

            while (!isValidInput) {
                System.out.print("Enter an integer between 1 and 1,000,000 to test: ");
                try {
                    number = Integer.parseInt(scanner.nextLine());
                    if (number >= 1 && number <= 1000000) {
                        isValidInput = true;
                    } else {
                        System.out.println("Error: Input out of range.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Input is not an integer.");
                }
            }

            //For benchmarking, outputs the execution time for each run
            long startTime = System.nanoTime();
            boolean isPrime = isPrime(number);
            long endTime = System.nanoTime();
            long executionTime = (endTime - startTime) / 1000; // microseconds
            System.out.println(number + " is prime: " + isPrime);
            System.out.println("Execution time: " + executionTime + " microseconds");

            System.out.print("Do you want to test again? (Y/N): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("Y")) {
                testAgain = false;
            }
        }
    }

    //Cases to check to determine if integer is a prime number or not
    public static boolean isPrime(int number) {
        // Case 1: If number is less than 2
        if (number < 2) {
            return false;
        }
        // Case 2: If integer is divisible by any number between 2 and the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}