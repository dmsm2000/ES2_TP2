import java.util.LinkedList;

public class OrdersCollection {

    private Order[] orders;

    public OrdersCollection(Order[] orders) {
        this.setOrders(orders);
    }

    public Order[] getOrders() {
        return this.orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public int getNumClients() {

        LinkedList<Order> temp = new LinkedList<>();

        for (Order o : this.orders) {
            if (!temp.contains(o)) {
                temp.add(o);
            }
        }

        return temp.size();
    }

}
