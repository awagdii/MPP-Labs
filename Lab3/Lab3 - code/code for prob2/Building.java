import java.util.ArrayList;
import java.util.List;

public class Building {
    private int number;
    private double maintenanceCost;
    private List<Apartment> apartmentList;


    public Building(int number, double maintenanceCost, List<Apartment> apartmentList) {
        this.number = number;
        this.maintenanceCost = maintenanceCost;
        this.apartmentList = apartmentList;
    }

    public void addApartment(Apartment apartment) {
        apartmentList.add(apartment);
    }

    public double calculateProfit() {
        double result = 0.0;
        for (Apartment apartment : apartmentList) {
            result += apartment.getRent();
        }
        return result - maintenanceCost;
    }


}
