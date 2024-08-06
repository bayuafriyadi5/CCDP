import java.util.Scanner;

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

        // Membangun objek Laundry menggunakan LaundryBuilder
        LaundryBuilder builder = new LaundryBuilder();
        Laundry laundry = builder.withName(name)
                                .withDateIn(dateIn)
                                .withWeight(weight)
                                .withDateOut(dateOut)
                                .build(LaundryService.getInstance());

        // Mencetak struk
        LaundryService.getInstance().printReceipt(laundry);

        scanner.close();
    }
}