import java.util.Scanner;

public class Excercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        char choice;
        
        do {
            System.out.print("Enter an integer (n) or 'q' to quit: ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                int result = computeValue(n);
                System.out.println("Result for n = " + n + ": " + result);
            } else {
                choice = scanner.next().charAt(0);
                if (choice == 'q' || choice == 'Q') {
                    System.out.println("Exiting the program...");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
                }
            }
        } while (true);
        
        scanner.close();
    }
    
    public static int computeValue(int n) {
        return n + Integer.parseInt(String.valueOf(n) + String.valueOf(n)) + Integer.parseInt(String.valueOf(n) + String.valueOf(n) + String.valueOf(n));
    }
}