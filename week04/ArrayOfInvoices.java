package week04;

import java.util.Scanner;
import week03.invoice.Invoice;

public class ArrayOfInvoices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of invoices: ");
        int numInvoices = scanner.nextInt();
        scanner.nextLine();

        // Create an array to store Invoice objects
        Invoice[] invoices = new Invoice[numInvoices];

        // Input information for each invoice
        for (int i = 0; i < numInvoices; i++) {
            System.out.println("\nInvoice " + (i + 1) + ":");
            System.out.print("Enter part number: ");
            String partNumber = scanner.nextLine();
            System.out.print("Enter part description: ");
            String partDescription = scanner.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter price per item: ");
            double pricePerItem = scanner.nextDouble();
            scanner.nextLine(); 

            // Create an Invoice object with the provided information
            invoices[i] = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }

        // Output invoice details along with invoice amount
        System.out.println("\nInvoice Details:");
        for (int i = 0; i < numInvoices; i++) {
            System.out.println("Invoice " + (i + 1) + ":");
            System.out.println("Part Number: " + invoices[i].getPartNumber());
            System.out.println("Part Description: " + invoices[i].getPartDescription());
            System.out.println("Quantity: " + invoices[i].getQuantity());
            System.out.println("Price Per Item: $" + invoices[i].getPricePerItem());
            System.out.println("Invoice Amount: $" + invoices[i].getInvoiceAmount());
            System.out.println();
        }

        scanner.close();
    }
}
