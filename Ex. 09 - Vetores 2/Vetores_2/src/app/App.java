package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int n = input.nextInt();
        Product[] vect = new Product[n];
        System.out.println();

        for (int i = 0; i < vect.length; i++) {
            input.nextLine();
            System.out.print("Nome do " + (i+1) + "º produto: ");
            String name = input.nextLine();
            System.out.print("Preco do " + (i+1) + "º produto: ");
            double price = input.nextDouble();
            vect[i] = new Product(name, price);
            System.out.println();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        System.out.printf("AVERAGE PRICE =  %.2f\n", sum/vect.length);

        input.close();
    }
}