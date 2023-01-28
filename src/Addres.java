public class Addres {
   private String state;
   private String city;
   private String street;
   private String alley;
   private String plak;

    public Addres() {
    }

    public Addres(String state, String city, String street, String alley, String plak) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.alley = alley;
        this.plak = plak;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getPlak() {
        return plak;
    }

    public void setPlak(String plak) {
        this.plak = plak;
    }


}
