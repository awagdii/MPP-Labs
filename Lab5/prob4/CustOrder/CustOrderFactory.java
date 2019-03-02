package prob4.CustOrder;

import java.time.LocalDate;

public class CustOrderFactory {

    public static Item newItem(String name) {
        return Item.newItem(name);
    }


    public static void addNewItemToOrder(Order order, String itemName) {
        order.addItem(newItem(itemName));
    }

    public static Order newOrder(Customer cust, LocalDate date) {
        return Order.newOrder(cust, date);
    }
}
