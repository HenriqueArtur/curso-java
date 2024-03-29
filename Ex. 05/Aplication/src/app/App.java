package app;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf( "Circumference: %.2f%n", c );
        System.out.printf( "Volume: %.2f%n", v );
        System.out.printf( "PI value: %.2f%n", Calculator.PI );

        input.close();
    }
}