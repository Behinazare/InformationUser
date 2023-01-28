public class InformationUser {

    private String name;
    private String family;
    private Addres addres;

    public InformationUser() {
    }

    public InformationUser(String name, String family, Addres addres) {
        this.name = name;
        this.family = family;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }


    public void PrintInfo(){
        System.out.println("Hello "+name+" "+family+"  Addres is:  state:"+addres.getState()+"   city is :" +addres.getCity()+"Street is : "+addres.getStreet()+"   alley is : "+addres.getAlley()+"   pelak is"+addres.getPlak());
    }
    public String toString(){
        return name+"-"+family+"-"+addres;
    }
    public boolean equals(Object obj1){
        InformationUser informationUser = (InformationUser) obj1;
        if (informationUser.name==name && informationUser.family==family && informationUser.addres==addres){
            return  true;
        }
        return false;
    }

}
