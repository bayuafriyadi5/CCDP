// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter date in (YYYY-MM-DD):");
        String dateIn = scanner.nextLine();
        
        System.out.println("Enter weight (kg):");
        double weight = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        
        System.out.println("Enter date out (YYYY-MM-DD):");
        String dateOut = scanner.nextLine();

        // Create basic receipt
        BasicLaundryReceipt receipt = new BasicLaundryReceipt(name, dateIn, weight, dateOut);

        // Optionally add fragrance
        System.out.println("Add fragrance? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            LaundryService fragrance = LaundryServiceFactory.getService("Fragrance");
            receipt.addService(fragrance);
        }

        // Optionally add ironing
        System.out.println("Add ironing? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            LaundryService ironing = LaundryServiceFactory.getService("Ironing");
            receipt.addService(ironing);
        }

        // Use visitors
        CostCalculatorVisitor costCalculator = new CostCalculatorVisitor();
        receipt.accept(costCalculator);
        System.out.println("Total Price: $" + costCalculator.getTotalCost());

        ReceiptPrinterVisitor receiptPrinter = new ReceiptPrinterVisitor();
        receipt.accept(receiptPrinter);

        scanner.close();
    }
}
