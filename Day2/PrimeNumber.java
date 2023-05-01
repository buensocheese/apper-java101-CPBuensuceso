import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integer: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number);
        System.out.println(isPrime);
    }
    
    public static boolean isPrime(int number) {
        // Case 1: If number is less than 1
        if (number <= 1) {
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
