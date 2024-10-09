package Lab1;

import java.util.Scanner;

class Data {
    private Integer counter = 0;
    private Double average = 0.0;
    private Double highest = Double.NEGATIVE_INFINITY; 

    public Data () {}

    public void add (Double input) {
        if (input > this.highest) {
            this.highest = input;
        }
        
        this.counter++;
        this.average = ((counter - 1) * average + input) / counter;
    }

    public Double getAverage () {
        if (counter == 0) {
            return 0.0;
        }

        return this.average;
    }

    public Double largest () {
        return  this.highest;
    }
}

class Analyzer {
    private static Data data = new Data();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("Enter number(\"Q\" to quit): ");
            String input = scan.next();

            if (input.equals("Q")) {
                System.out.println("Quiting...");
                break;
            }

            try {
                Double numero = Double.parseDouble(input);
                data.add(numero);
            } catch (NumberFormatException e) {
                System.out.printf("Double parse error: %e", e);
            }
        }

        scan.close();

        System.out.printf("Average = %.1f\n", data.getAverage());
        System.out.printf("Maximum = %.1f", data.largest());
    }
}