import java.util.Arrays;
import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new HourlyEmp(1, 20, 30);
        Employee emp2 = new SalariedEmp(2, 2000);
        Order order1 = new Order(1, new Date(2019,02,28), 1000);
        Order order2 = new Order(1, new Date(2019,02,28), 10000);
        Order[] orders = {order1, order2};
        Employee emp3 = new CommissionedEmp(3, .10, 500, Arrays.asList(orders));
        System.out.println(emp1.calcCompensation(3, 2019).print());
        System.out.println(emp2.calcCompensation(3, 2019).print());
        System.out.println(emp3.calcCompensation(3, 2019).print());
    }
}
