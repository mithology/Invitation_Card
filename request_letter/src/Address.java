
public class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCountry(){
        return country;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
}
