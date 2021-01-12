public class Destination implements DestinationADT {

    private String name;
    private Address address;

    public Destination(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.address.toString() + "]";
    }
}
