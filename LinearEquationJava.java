
package linearequationjava;

import java.util.Scanner;

public class LinearEquationJava {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Constructor
    public LinearEquationJava(double a, double b, double c,
                              double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Check whether the equation is solvable
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // Calculate x
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // Calculate y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    // Test program
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquationJava equation =
                new LinearEquationJava(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }

        input.close();
    }
}


