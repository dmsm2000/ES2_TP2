import java.util.LinkedList;

public class Order implements OrderADT {

    private Destination destination;
    private Customer customer;
    private Container[] containers;

    public Order(Destination destination, Customer customer, Container[] containers) {
        this.containers = containers;
        this.customer = customer;
        this.destination = destination;
    }

    public Container[] getContainers() {
        return this.containers;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setContainers(Container[] containers) {
        this.containers = containers;
    }

}
