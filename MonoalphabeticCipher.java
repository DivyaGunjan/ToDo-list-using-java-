import java.util.*;

public class MonoalphabeticCipher {

    // Generate a random substitution key
    public static String generateKey() {
        List<Character> letters = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letters.add(c);
        }
        Collections.shuffle(letters);
        StringBuilder key = new StringBuilder(26);
        for (char c : letters) {
            key.append(c);
        }
        return key.toString();
    }

    // Create dictionaries for encryption and decryption
    public static Map<Character, Character> createEncryptDict(String key) {
        Map<Character, Character> encryptDict = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            encryptDict.put((char) ('a' + i), key.charAt(i));
        }
        return encryptDict;
    }

    public static Map<Character, Character> createDecryptDict(String key) {
        Map<Character, Character> decryptDict = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            decryptDict.put(key.charAt(i), (char) ('a' + i));
        }
        return decryptDict;
    }

    // Encrypt the plaintext using the substitution dictionary
    public static String encrypt(String plaintext, Map<Character, Character> encryptDict) {
        StringBuilder ciphertext = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (encryptDict.containsKey(c)) {
                ciphertext.append(encryptDict.get(c));
            } else {
                ciphertext.append(c);  // Non-alphabetic characters are added as-is
            }
        }
        return ciphertext.toString();
    }

    // Decrypt the ciphertext using the substitution dictionary
    public static String decrypt(String ciphertext, Map<Character, Character> decryptDict) {
        StringBuilder plaintext = new StringBuilder();
        for (char c : ciphertext.toCharArray()) {
            if (decryptDict.containsKey(c)) {
                plaintext.append(decryptDict.get(c));
            } else {
                plaintext.append(c);  // Non-alphabetic characters are added as-is
            }
        }
        return plaintext.toString();
    }

    // Main function to demonstrate the cipher
    public static void main(String[] args) {
        // Generate a random key
        String key = generateKey();
        System.out.println("Random substitution key: " + key);

        // Create encryption and decryption dictionaries
        Map<Character, Character> encryptDict = createEncryptDict(key);
        Map<Character, Character> decryptDict = createDecryptDict(key);

        // Input plaintext
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine().toLowerCase();

        // Encrypt the plaintext
        String ciphertext = encrypt(plaintext, encryptDict);
        System.out.println("Ciphertext: " + ciphertext);

        // Decrypt the ciphertext
        String decryptedText = decrypt(ciphertext, decryptDict);
        System.out.println("Decrypted text: " + decryptedText);
        
        scanner.close();
    }
}
