// a two-dimensional array such that A[i][j] is false if iand i are prime otherwise true
import java.util.Scanner;
public class Exercise158 {
    public static void main(String[] args) {
        int m = 5; // size of the two-dimensional array
        boolean[][] A = new boolean[m][m];

        // loop through the two-dimensional array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                // check if i and j are prime
                if (isPrime(i) && isPrime(j)) {
                    A[i][j] = false;
                } else {
                    A[i][j] = true;
                }
            }
        }

        // print the two-dimensional array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
