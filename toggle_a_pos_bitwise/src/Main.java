import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Input position
        System.out.print("Enter the position to toggle (0-based): ");
        int pos = scanner.nextInt();

        // Validate position
        if (pos < 0 || pos >= 32) {
            System.out.println("Invalid position. Position should be between 0 and 31.");
            return;
        }

        // Toggle bit at the specified position
        int result = toggleBit(n, pos);

        // Display the result
        System.out.println("Number after toggling bit at position " + pos + ": " + result);
    }

    // Function to toggle a bit at a specific position
    private static int toggleBit(int n, int pos) {
        // Create a mask with 1 at the specified position
        int mask = 1 << pos;

        // Toggle the bit using XOR
        return n ^ mask;
    }
}
