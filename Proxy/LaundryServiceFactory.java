// LaundryServiceFactory.java
import java.util.HashMap;

public class LaundryServiceFactory {
    private static final HashMap<String, LaundryService> services = new HashMap<>();

    public static LaundryService getService(String serviceType) {
        LaundryService service = services.get(serviceType);

        if (service == null) {
            switch (serviceType) {
                case "Fragrance":
                    service = new FragranceService();
                    break;
                case "Ironing":
                    service = new IroningService();
                    break;
            }
            services.put(serviceType, service);
        }
        return service;
    }
}
