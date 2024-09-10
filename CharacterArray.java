import java.util.Scanner;

public class CharacterArray {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Declare a character array of size ten
        char[] charArray = new char[10];
        
        // Accept characters into the array
        System.out.println("Enter 10 characters:");
        for (int i = 0; i < 10; i++) {
            // Read a character from the user and store it in the array
            charArray[i] = scanner.next().charAt(0);
        }
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
        
        // Find the character with the highest ASCII value
        char maxChar = charArray[0];
        for (int i = 1; i < 10; i++) {
            if (charArray[i] > maxChar) {
                maxChar = charArray[i];
            }
        }
        
        // Find the character with the lowest ASCII value
        char minChar = charArray[0];
        for (int i = 1; i < 10; i++) {
            if (charArray[i] < minChar) {
                minChar = charArray[i];
            }
        }
        
        // Display the characters with the highest and lowest ASCII values
        System.out.println("Character with highest ASCII value: " + maxChar);
        System.out.println("Character with lowest ASCII value: " + minChar);
    }
}
