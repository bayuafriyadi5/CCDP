// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaundryFactory factory = new SimpleLaundryFactory();

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter date in (YYYY-MM-DD):");
        String dateIn = scanner.nextLine();
        
        System.out.println("Enter weight (kg):");
        double weight = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        
        System.out.println("Enter date out (YYYY-MM-DD):");
        String dateOut = scanner.nextLine();
        
        System.out.println("Enter total price:");
        double totalPrice = scanner.nextDouble();

        LaundryReceipt receipt = factory.createReceipt(name, dateIn, weight, dateOut, totalPrice);
        receipt.printReceipt();
        
        scanner.close();
    }
}
