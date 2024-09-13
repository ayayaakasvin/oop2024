import java.util.Scanner;

class Example3 {
    public static String GetGrade (Integer grade) {
        if (grade > 95) {
            return "A";
        } else if (grade >= 90) {
            return "A-";
        } else if (grade >= 85) {
            return "B+";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 75) {
            return "B-";
        } else if (grade >= 70) {
            return "C+";
        } else if (grade >= 65) {
            return "C";
        } else if (grade >= 60) {
            return "C-";
        } else if (grade >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a grade value (or type 'exit' to quit):");
            String input = scan.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            try {
                Integer points = Integer.parseInt(input);
                System.out.printf("Your grade is : %s\n", Example3.GetGrade(points));
            } catch (Exception e) {
                System.out.printf("Integer parse error : %e", e);
            }
        }

        scan.close();
    }
}