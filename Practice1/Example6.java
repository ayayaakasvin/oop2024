import java.util.Scanner;
import java.lang.StringBuilder;

class Example6 {
    public static boolean IsPalindrom (String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string (or type 'exit' to quit):");
            String input = scan.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            if (IsPalindrom(input)) {
                System.out.printf("String %s is pallindrom", input);
            }
        }

        scan.close();
    }
}
