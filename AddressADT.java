public interface AddressADT {

    public String getCountry();

    public int getNumber();

    public void setNumber(int number);

    public String getPostal_code();

    public void setPostal_code(String postal_code);

    public String getCity();

    public void setCity(String city);

    public String getStreet();

    public void setStreet(String street);

    public void setCountry(String country);

    public String toString();

}
