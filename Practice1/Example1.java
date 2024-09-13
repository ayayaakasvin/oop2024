import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        ExampleAnswer task = new ExampleAnswer();
        
        task.PrintStringInsideBox();
    }
}

class ExampleAnswer {
    public ExampleAnswer () {
        
    }

    public void PrintStringInsideBox () {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string (or type 'exit' to quit):");
            String input = scan.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print(returnBox(input));
        }

        scan.close();
    }

    private static String returnBox (String input) {
        if (input.isEmpty()) {
            return "Empty input error\n";
        }

        String result = "";
        Integer length = input.length();
        result += "+" + longDash(length) + "+\n";
        result += "|" + input + "|\n";
        result += "+" + longDash(length) + "+\n";

        return result;
    }

    private static String longDash(int length) {
        StringBuilder dashes = new StringBuilder();

        for (int i = 0; i < length; i++) {
            dashes.append("-");
        }

        return dashes.toString();
    }
}