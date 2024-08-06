import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Kelas Singleton untuk mengelola layanan laundry
class LaundryService {
    private static LaundryService instance;
    private double ratePerKg = 5000; // Tarif per kilogram
    private ArrayList<Transaction> transactions;

    private LaundryService() {
        // Private constructor untuk mencegah instansiasi langsung
        transactions = new ArrayList<>();
    }

    // Metode untuk mendapatkan satu-satunya instance dari LaundryService
    public static LaundryService getInstance() {
        if (instance == null) {
            instance = new LaundryService();
        }
        return instance;
    }

    // Metode untuk menghitung biaya berdasarkan berat
    public double calculateCost(double weight) {
        return weight * ratePerKg;
    }

    // Metode untuk mencetak struk
    public void printReceipt(String name, String dateIn, double weight, String dateOut, double totalPrice) {
        System.out.println("====== Struk Laundry ======");
        System.out.println("Nama          : " + name);
        System.out.println("Tanggal Masuk : " + dateIn);
        System.out.println("Berat         : " + weight + " kg");
        System.out.println("Tanggal Keluar: " + dateOut);
        System.out.println("Total Harga   : Rp " + totalPrice);
        System.out.println("===========================");
    }

    // Metode untuk menambahkan transaksi
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Metode untuk mendapatkan iterator transaksi
    public Iterator<Transaction> getTransactionIterator() {
        return transactions.iterator();
    }
}

// Kelas Transaction
class Transaction {
    private String name;
    private String dateIn;
    private double weight;
    private String dateOut;
    private double totalPrice;

    public Transaction(String name, String dateIn, double weight, String dateOut, double totalPrice) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public String getDateIn() {
        return dateIn;
    }

    public double getWeight() {
        return weight;
    }

    public String getDateOut() {
        return dateOut;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

public class LaundryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LaundryService laundryService = LaundryService.getInstance();

        while (true) {
            System.out.print("Masukkan nama: ");
            String name = scanner.nextLine();

            System.out.print("Masukkan tanggal masuk (dd-MM-yyyy): ");
            String dateIn = scanner.nextLine();

            System.out.print("Masukkan berat (kg): ");
            double weight = scanner.nextDouble();

            // Flush scanner buffer
            scanner.nextLine();

            System.out.print("Masukkan tanggal keluar (dd-MM-yyyy): ");
            String dateOut = scanner.nextLine();

            double totalPrice = laundryService.calculateCost(weight);

            Transaction transaction = new Transaction(name, dateIn, weight, dateOut, totalPrice);
            laundryService.addTransaction(transaction);

            laundryService.printReceipt(name, dateIn, weight, dateOut, totalPrice);

            System.out.print("Apakah ingin menambahkan transaksi lagi? (y/n): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Iterate over transactions using iterator
        Iterator<Transaction> iterator = laundryService.getTransactionIterator();
        while (iterator.hasNext()) {
            Transaction transaction = iterator.next();
            System.out.println("Nama: " + transaction.getName() + ", Total Harga: Rp " + transaction.getTotalPrice());
        }

        scanner.close();
    }
}