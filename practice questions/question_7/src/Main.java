import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0, p = 0, z = 0;
        double number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'x' to exit):");

        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                System.out.println("Exiting the program.");
                break;
            }

            try {
                number = Double.parseDouble(input);
                System.out.println("You entered: " + number);

                if (number > 0) {
                    p++;
                } else if (number < 0) {
                    n++;
                } else {
                    z++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to exit.");
            }
        }

        scanner.close();

        System.out.println("Number of +ve numbers is: " + p);
        System.out.println("Number of -ve numbers is: " + n);
        System.out.println("Number of 0 numbers is: " + z);
    }
}