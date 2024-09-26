package Lab1;

import java.util.Scanner;

class Circle {
    public enum CircleType { // enum usage
        SMALL, MEDIUM, LARGE
    }

    public static final Double PI = 3.14159; // read - only field, also constant value

    public final CircleType type; // enum field insid

    public static int circleCount = 0;

    public Double radius;

    {
        System.out.println("New Circle object is created."); // Initialization block where we set radius value
        radius = 0.0;
    }

    public Circle () { // first contructor w\o any args
        this.radius = 0.0;
        this.type = CircleType.SMALL;
        circleCount++;  
    }

    public Circle(Integer radius) { // second contructor with Integer value args
        if (radius < 0) {
            System.out.println("Invalid input, radius was set to 0.0!");
            this.type = isType(radius.doubleValue());    
            circleCount++;        
            return;
        }

        this.radius = radius.doubleValue();
        this.type = isType(radius.doubleValue());
        circleCount++;        
    }

    public Circle(Double radius) { // thied contructor with Double type value args
        if (radius < 0.0) {
            System.out.println("Invalid input, radius was set to 0.0!");
            this.type = isType(radius.doubleValue());            
            circleCount++;        
            return;
        }
        
        this.radius = radius;
        this.type = isType(radius);
        circleCount++;        
    }

    private CircleType isType (Double radius) { // private function to assign CircleType to Circle Object depending on its radius
        if (radius < 10) {
            return CircleType.SMALL;
        } else if (radius < 30) {
            return CircleType.MEDIUM;
        }

        return CircleType.LARGE;
    }

    public Double calculateArea() { // calculates area of Circle
        return PI * radius * radius;
    }

    public Double calculateCurcimference() { // calculates curcimference of Circle
        return PI * radius * 2;
    }

    public void PropertiesPrint() { // used for printing circle properties
        System.out.printf(
            "Circle with radius %.2f has \n    * Circumference of %.2f units\n    * Area of %.2f square units\n", 
            this.radius, this.calculateCurcimference(), this.calculateArea()
        );
        System.out.printf("Circle`s type is %s", this.type);
        System.out.println();
        System.out.println();
    }

    public static Integer getCount () { // used for getting the total number of Circle object 
        return circleCount;
    }

    public static Circle usingInput () { // used for creating user custom circle
        Scanner scan  = new Scanner(System.in);
        System.out.print("Please enter the radius: ");
        String rds = scan.next();
        scan.close();
        if (rds == null || rds.isEmpty()) {
            System.out.println("Invalid input.\nExiting...");
            return null;
        }

        try {
            Double rdsDouble = Double.parseDouble(rds);
            Circle c1 = new Circle(rdsDouble);
            c1.PropertiesPrint();

            return c1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input. Please enter a valid number.");
            return null;
        }
    }
    

    public static void main(String[] args) { // main func
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(50);
        Circle emptyCircle = new Circle();
        Circle wrongInput = new Circle(-1);

        c1.PropertiesPrint();
        c2.PropertiesPrint();
        emptyCircle.PropertiesPrint();
        wrongInput.PropertiesPrint();
        System.out.printf("Total number of circleCount : %d\n", Circle.circleCount);

        Circle newOne = Circle.usingInput();
        System.out.printf("Total number of circleCount : %d\n", Circle.circleCount);
    }
}
