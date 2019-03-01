import java.util.ArrayList;
import java.util.List;

public class CommissionedEmp extends Employee {

    double commission;
    double baseSalary;

    List<Order> orderList;

    public CommissionedEmp(long empId, double commission, double baseSalary, List<Order> orderList) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orderList = orderList;
    }

    @Override
    public double calcGrossPay(int month, int year) {

        double commisionResult = 0;

        for (Order order : orderList) {
            if (order.getOrderDate().getYear() == year && order.getOrderDate().getMonth() == month - 1) {
                commisionResult += order.getOrderAmount();
            }
        }
        System.out.println(commisionResult);
        commisionResult *= commission;
        return baseSalary + commisionResult;
    }
}
