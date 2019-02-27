import java.util.ArrayList;
import java.util.List;

public class LandLord {

    private String name;
    private List<Building> ownedBuildings;

    public LandLord(String name) {
        this.name = name;
        this.ownedBuildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        ownedBuildings.add(building);
    }

    public double calculateProfit() {
        double result = 0.0;
        for (Building building : ownedBuildings
        ) {
            result += building.calculateProfit();
        }
        return result;
    }
}
