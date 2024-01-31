public class Main {
    public static void main (String[] args) {
        // Lab 04 01 Sales Tax

        double price = 100.0;
        double tax = .05;
        double taxed;
        double total;

        taxed = price * tax;
        total = price + taxed;

        System.out.println("Price: $" + price);
        System.out.println("Taxed: $" + taxed);
        System.out.println("Total: $" + total);
    }
}
