import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caretaker caretaker = new Caretaker();

        // Menggunakan Bridge Pattern
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();

        System.out.println("Enter date in (YYYY-MM-DD):");
        String dateIn = scanner.nextLine();

        System.out.println("Enter weight (kg):");
        double weight = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.println("Enter date out (YYYY-MM-DD):");
        String dateOut = scanner.nextLine();

        // Menggunakan Template Method Pattern
        AbstractLaundryReceipt receipt = new ConcreteLaundryReceipt();
        receipt.setState(name, dateIn, weight, dateOut);

        // Menyimpan state ke memento
        caretaker.add(receipt.saveStateToMemento());

        // Menggunakan Prototype Pattern
        ConcreteLaundryReceipt clonedReceipt = ((ConcreteLaundryReceipt) receipt).clone();

        // Mencetak receipt asli
        System.out.println("Original Receipt:");
        receipt.printReceipt();

        // Mencetak receipt hasil kloning
        System.out.println("Cloned Receipt:");
        clonedReceipt.printReceipt();

        // Contoh mengembalikan state
        System.out.println("\nRestoring previous state...");
        receipt.getStateFromMemento(caretaker.get(0));

        // Mencetak receipt yang sudah di-restore
        System.out.println("Restored Receipt:");
        receipt.printReceipt();

        scanner.close();
    }
}
