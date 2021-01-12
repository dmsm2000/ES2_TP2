public class Customer implements CustomerADT {

    private String name, nif;
    private Address address;

    public Customer(String name, String nif, Address address) {
        this.setName(name);
        this.setNif(nif);
        this.setAddress(address);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.nif + ", " + this.address.toString() + "]";
    }

}