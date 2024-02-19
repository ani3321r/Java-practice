import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }

        scanner.close();
    }

    // Function to check if a number is a power of 2
    private static boolean isPowerOfTwo(int n) {
        // A number is a power of 2 if it has only one set bit (binary 1)
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
