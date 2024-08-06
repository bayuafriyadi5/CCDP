// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaundryReceipt receipt = new LaundryReceipt();
        Caretaker caretaker = new Caretaker();

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter date in (YYYY-MM-DD):");
        String dateIn = scanner.nextLine();
        
        System.out.println("Enter weight (kg):");
        double weight = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        
        System.out.println("Enter date out (YYYY-MM-DD):");
        String dateOut = scanner.nextLine();

        // Set the state of the receipt
        receipt.setState(name, dateIn, weight, dateOut);

        // Save the state to memento
        caretaker.add(receipt.saveStateToMemento());

        // Print the receipt
        receipt.printReceipt();

        // Example of restoring state
        System.out.println("\nRestoring previous state...");

        // Restore the state from memento
        receipt.getStateFromMemento(caretaker.get(0));

        // Print the restored receipt
        receipt.printReceipt();
        
        scanner.close();
    }
}
