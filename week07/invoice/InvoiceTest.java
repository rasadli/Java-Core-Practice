package week07.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        try {
            Invoice firstInvoice = new Invoice("001", "Hammer", 5, 10.0);
            Invoice secondInvoice = new Invoice("002", "Screwdriver", -2, -5.0);

            System.out.println("Invoice 1 : ");
            System.out.println("Part Number: " + firstInvoice.getPartNumber());
            System.out.println("Part description: " + firstInvoice.getPartDescription());
            System.out.println("Quantity: " + firstInvoice.getQuantity());
            System.out.println("Price Per Item: " + firstInvoice.getPricePerItem());
            System.out.println("Invoice Amount: " + firstInvoice.getInvoiceAmount());

            System.out.println("");

            System.out.println("Invoice 2 : ");
            System.out.println("Part Number: " + secondInvoice.getPartNumber());
            System.out.println("Part Description: " + secondInvoice.getPartDescription());
            System.out.println("Quantity: " + secondInvoice.getQuantity());
            System.out.println("Price Per Item: " + secondInvoice.getPricePerItem());
            System.out.println("Invoice Amount: " + secondInvoice.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
