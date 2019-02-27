package lab2_prob2b;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private String orderNumber;
	private ArrayList<OrderLine> lines;
	private Date orderDate;

	public Order(String orderNumber, int lineNum) {
		this.orderNumber = orderNumber;
		this.orderDate = new Date();
		OrderLine line = new OrderLine(this, lineNum);
		this.lines=new ArrayList<>();
		this.lines.add(line);

	}

	public void addOrderLine(int lineNum) {
		this.lines.add(new OrderLine(this, lineNum));
	}

	public ArrayList<OrderLine> getLines() {
		return lines;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order{" +
				"orderNumber='" + orderNumber + '\'' +
				", lines=" + lines +
				", orderDate=" + orderDate +
				'}';
	}
}
