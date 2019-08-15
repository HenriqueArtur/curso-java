package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Accont;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Accont accont;

        System.out.print("Enter account number: ");
        int number = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char answer = input.next().charAt(0);

        if( answer == 'y' ) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();

            accont = new Accont(number, holder, initialDeposit);
        } else {
            accont = new Accont(number, holder);
        }

        System.out.println();
        System.out.println( "Account data:" );
        System.out.println( accont );

        System.out.println();
        System.out.print( "Enter a deposit value: " );
        double amount = input.nextDouble();
        accont.deposit(amount);
        System.out.println( "Update account data:" );
        System.out.println( accont );

        System.out.println();
        System.out.print( "Enter a withdraw value: " );
        amount = input.nextDouble();
        accont.withdraw(amount);
        System.out.println( "Update account data:" );
        System.out.println( accont );

        input.close();
    }
}