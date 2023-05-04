public class OddEven {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};

        //Initial Values
        int oddCount = 0;
        int evenCount = 0;

        //Checker Loop/Count Update
        for (int num : nums) {
            if (isEven(num)) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        //Outputs Final Count
        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }
    //Odd/Even Checker
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}