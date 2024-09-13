import java.util.Scanner;
import java.lang.Math;

class Example2 {
    Integer side;

    public Example2 (Integer side) {
        this.side = side;
    }

    private Integer Area () {
        return side * side;
    }

    private Integer Perimeter () {
        return side * 4;
    }

    private Double Diagonal () {
        return side * Math.sqrt(2.0);
    }

    public void DisplayInfo () {
        System.out.printf("Square with sides %d\n", side);
        System.out.printf("Area : %d\n", Area());
        System.out.printf("Perimeter : %d\n", Perimeter());
        System.out.printf("Diagonal length : %f\n", Diagonal());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a side length (or type 'exit' to quit):");
            String input = scan.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            try {
                Integer length = Integer.parseInt(input);
                Example2 square = new Example2(length);
                square.DisplayInfo();
            } catch (Exception e) {
                System.out.println("Please enter a valid number or 'exit' to quit.");
            }
        }

        scan.close();
    }
}