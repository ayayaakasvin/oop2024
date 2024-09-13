import java.lang.Math;
import java.util.Scanner;
import java.lang.String;

class Example4 {
    Double a, b, c;

    public Example4 (Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Double FindDiscriminant () {
        return (b * b) - (4 * a * c);
    }

    public QuadraticRoots GetRootsOfQuadratic () {
        Double discriminant = FindDiscriminant();

        if (discriminant < 0) {
            return new QuadraticRoots(null, null);
        } else if (discriminant == 0) {
            Double root = -b / (2 * a);
            return new QuadraticRoots(root, root);
        } else {
            Double root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
            Double root2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
            return new QuadraticRoots(root1, root2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coefficients a, b, and c of the quadratic equation (ax^2 + bx + c = 0):");
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();

        Example4 equation = new Example4(a, b, c);
        QuadraticRoots roots = equation.GetRootsOfQuadratic();
        roots.DisplayInfo();

        scan.close();
    }
}

class QuadraticRoots {
    Double first;
    Double second;

    public QuadraticRoots (Double root1, Double root2) {
        this.first = root1;
        this.second = root2;
    }

    private boolean hasRoots () {
        return first != null || second != null;
    }

    private boolean sameRoots() {
        return first != null && first.equals(second);
    }

    private String formatRoot (Double root) {
        if (root == root.intValue()) {
            return String.format("%d", root.intValue());
        } else {
            return String.format("%f", root);
        }
    }

    public void DisplayInfo () {
        if (!hasRoots()) {
            System.out.println("Equation has no roots");
        } else if (sameRoots()) {
            System.out.printf("Equation has 1 root : %s", formatRoot(first));
        } else {
            System.out.printf("Equation has 2 roots : %s and %s", formatRoot(first), formatRoot(second));
        }
    }
}