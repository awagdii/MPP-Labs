package prob4.CustOrder;

public class Item {
    String name;

    private Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static Item newItem(String name) {
        return new Item(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
