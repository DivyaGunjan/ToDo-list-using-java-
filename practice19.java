public class practice19 {
    public static void main(String[] args) {
        long number = 12345;
        System.out.println("Sum of digits of " + number + " is: " + sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // Get the last digit and add it to sum
            n /= 10;       // Remove the last digit from the number
        }
        return sum;
    }
}