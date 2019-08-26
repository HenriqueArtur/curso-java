package app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(input.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(input.next());
        
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int itemsQuantity = input.nextInt();
        for (int i = 1; i <= itemsQuantity; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            input.nextLine();
            String productName = input.nextLine();
            System.out.print("Product price: ");
            double price = input.nextDouble();

            Product product = new Product(productName, price);

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        input.close();
    }
}