//Experiment 1 of INS lab 1
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to (E)ncrypt or (D)ecrypt? ");
        char choice = scanner.next().charAt(0);
ṇ
        if (choice == 'E' || choice == 'e') {
            System.out.print("Enter the text to encrypt: ");
            String plaintext = scanner.next();

            System.out.print("Enter the shift value: ");
            int shift = scanner.nextInt();

            String ciphertext = encrypt(plaintext, shift);
            System.out.println("Ciphertext: " + ciphertext);
        } else if (choice == 'D' || choice == 'd') {
            System.out.print("Enter the text to decrypt: ");
            String ciphertext = scanner.next();

            System.out.print("Enter the shift value: ");
            int shift = scanner.nextInt();

            String decrypted = decrypt(ciphertext, shift);
            System.out.println("Decrypted: " + decrypted);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c)? 'A' : 'a';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}