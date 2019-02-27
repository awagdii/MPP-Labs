import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(400);
        Apartment apartment2 = new Apartment(200);
        Apartment apartment3 = new Apartment(300);

        Apartment[] apartments = {apartment1, apartment2, apartment3};

        Building building = new Building(1, 100.0, Arrays.asList(apartments));
        LandLord landLord = new LandLord("Mark");

        landLord.addBuilding(building);

        System.out.println(landLord.calculateProfit());
    }
}
