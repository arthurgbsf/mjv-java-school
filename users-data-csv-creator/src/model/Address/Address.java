package model.Address;

public class Address {
    
    private String street;
    private Integer number;
    private String district;
    private String city;
    private String state;
    private String country;

    public Address(String street, Integer number, String district, String city, String state, String country) {
        
        this.street = street;
        this.number = number;
        this.district = district;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

     public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    
}
