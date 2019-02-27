package lab2_prob2b;

public class OrderLine {
    private Order order;
    private int lineNum;
    private int quantity;
    private double price;

    public OrderLine(Order order, int lineNum) {
        this.order = order;
        this.lineNum = lineNum;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                " lineNum=" + lineNum +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
