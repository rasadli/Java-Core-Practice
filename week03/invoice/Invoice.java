package week03.invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        // Ensure quantity is positive
        setQuantity(quantity);
        // Ensure pricePerItem is positive
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    // Getter and setter for partDescription
    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    // Getter and setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    // Getter and setter for pricePerItem
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Part Number: ").append(partNumber).append(", Description: ").append(partDescription)
          .append(", Quantity: ").append(quantity).append(", Price Per Item: ").append(pricePerItem);
        return sb.toString();
    }

}