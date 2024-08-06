import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Kelas Singleton untuk mengelola layanan laundry
class LaundryService {
    private static LaundryService instance;
    private double ratePerKg = 5000; // Tarif per kilogram

    private LaundryService() {
        // Private constructor untuk mencegah instansiasi langsung
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
}

public class LaundryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        // Mendapatkan instance LaundryService dan menghitung biaya
        LaundryService laundryService = LaundryService.getInstance();
        double totalPrice = laundryService.calculateCost(weight);

        // Mencetak struk
        laundryService.printReceipt(name, dateIn, weight, dateOut, totalPrice);

        scanner.close();
    }
}
