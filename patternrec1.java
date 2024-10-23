import java.util.Scanner;

public class patternrec1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of square: ");
        int size = scanner.nextInt();
        scanner.close();

        printSquare(size, size);
    }

    public static void printSquare(int size, int row) {
        if (row == 0) return;

        printRow(size);
        System.out.println();

        printSquare(size, row - 1);
    }

    public static void printRow(int size) {
        if (size == 0) return;

        System.out.print("* ");

        printRow(size - 1);
    }
}


