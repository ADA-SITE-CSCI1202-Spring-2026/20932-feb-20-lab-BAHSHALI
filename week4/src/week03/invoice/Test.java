package week03.invoice;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = input.nextInt();
        input.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part Number: ");
            String partNumber = input.nextLine();

            System.out.print("Part Description: ");
            String partDescription = input.nextLine();

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            System.out.print("Price per item: ");
            double price = input.nextDouble();
            input.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }

        System.out.println("-_-_-_-_-_-1Invoice Results");

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("Invoice " + (i + 1) +
                    " Total: " + invoices[i].getInvoiceAmount());
        }

        input.close();
    }
}