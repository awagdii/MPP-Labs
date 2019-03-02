package prob4.extpackage;

import prob4.CustOrder.CustOrderFactory;
import prob4.CustOrder.Customer;
import prob4.CustOrder.Order;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Bob");
        Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
        CustOrderFactory.addNewItemToOrder(order, "Shirt");
        CustOrderFactory.addNewItemToOrder(order, "Laptop");

        order = CustOrderFactory.newOrder(cust, LocalDate.now());
        CustOrderFactory.addNewItemToOrder(order, "Pants");
        CustOrderFactory.addNewItemToOrder(order, "Knife set");

        System.out.println(cust.getOrders());
    }
}

		
