import java.text.SimpleDateFormat;
import java.util.Date;

public class LaundryService {
    private static LaundryService instance;
    private double ratePerKg = 5000; // Tarif per kilogram

    private LaundryService() {
        // Private constructor untuk mencegah instansiasi langsung
    }

    public static synchronized LaundryService getInstance() {
        if (instance == null) {
            instance = new LaundryService();
        }
        return instance;
    }

    public double calculateCost(double weight) {
        return weight * ratePerKg;
    }

    public void printReceipt(Laundry laundry) {
        System.out.println("====== Struk Laundry ======");
        System.out.println("Nama          : " + laundry.getName());
        System.out.println("Tanggal Masuk : " + laundry.getDateIn());
        System.out.println("Berat         : " + laundry.getWeight() + " kg");
        System.out.println("Tanggal Keluar: " + laundry.getDateOut());
        System.out.println("Total Harga   : Rp " + laundry.getTotalPrice());
        System.out.println("===========================");
    }
}