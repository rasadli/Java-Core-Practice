package week03;

import week03.invoice.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("001", "Hammer", 7, 10.70);

        // Displaying invoice info
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}