package lab2_prob2b;

public class Main {

    public static void main(String args[]) {
        Order order1 = new Order("1",0);
        order1.addOrderLine(1);
        System.out.println(order1);
        System.out.println(order1.getLines());
    }

}
