import java.util.LinkedList;

public interface OrderADT {

    public Container[] getContainers();

    public Destination getDestination();

    public void setDestination(Destination destination);

    public Customer getCustomer();

    public void setCustomer(Customer customer);

    public void setContainers(Container[] containers);

}
