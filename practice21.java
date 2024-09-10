//compare the smallest number among three numbers
import java.util.Scanner;

public class practice21 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
	 int[] numbers = new int[3]; // Create an array to store the numbers

        // Read input from the user and store in the array
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Assume the first number is the smallest
        int smallest = numbers[0];

        // Compare each number in the array to find the smallest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest number is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}


