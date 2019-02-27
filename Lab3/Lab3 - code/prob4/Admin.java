import java.util.ArrayList;
import java.util.List;

public class Admin {
    public static double computeTotalRent(Property[] properties) {
        double totalRent = 0;
        for (Property o : properties) {
            totalRent += o.computeRent();
        }
        return totalRent;
    }

    public static List<Property> listAllPropertiesByCity(String city, Property[] properties) {
        List<Property> propertiesPerCity = new ArrayList<>();
        for (Property o : properties) {
            if(o.getCity().equals(city)){
                propertiesPerCity.add(o);
            }
        }
        return propertiesPerCity;
    }
}
