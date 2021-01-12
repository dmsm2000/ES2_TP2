public class Address implements AddressADT {

    private String country, street, city, postal_code;
    private int number;

    public Address(String country, String street, String city, String postal_code, int number) {
        this.country = country;
        this.street = street;
        this.city = city;
        this.postal_code = postal_code;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "[" + this.country + ", " + this.city + ", " + this.street + ", " + this.postal_code + ", " + this.number
                + "]";
    }

}
