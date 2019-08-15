package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner( System.in );

        Retangle retangle = new Retangle();

        System.out.println( "Enter rectangle width and height" );
        System.out.print( "Width: " );
        retangle.width = sc.nextDouble();
        System.out.print( "Height: " );
        retangle.height = sc.nextDouble();

        System.out.println();
        System.out.println( "AREA: " + retangle.area() );
        System.out.println( "PERIMETER: " + retangle.perimeter() );
        System.out.println( "DIAGONAL: " + retangle.diagonal() );

        sc.close();
    }
}