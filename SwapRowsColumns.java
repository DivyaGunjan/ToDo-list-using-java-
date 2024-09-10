import java.util.Scanner;

public class SwapRowsColumns {
    public static void main(String[] args) {
        int[][] array = takeInput();
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice to swap rows or columns (r/c):");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("r")) {
            System.out.println("Enter the indices of the rows to swap:");
            int row1 = scanner.nextInt();
            int row2 = scanner.nextInt();
            swapRows(array, row1, row2);
        } else if (choice.equalsIgnoreCase("c")) {
            System.out.println("Enter the indices of the columns to swap:");
            int col1 = scanner.nextInt();
            int col2 = scanner.nextInt();
            swapColumns(array, col1, col2);
        } else {
            System.out.println("Invalid choice!");
        }

        printArray(array);
    }

    public static int[][] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swapRows(int[][] array, int row1, int row2) {
        int[] temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;
    }

    public static void swapColumns(int[][] array, int col1, int col2) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][col1];
            array[i][col1] = array[i][col2];
            array[i][col2] = temp;
        }
    }
}