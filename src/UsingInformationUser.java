import java.util.Scanner;

public class UsingInformationUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name:");
        String name = scanner.next();
        System.out.print("Enter family:");
        String family = scanner.next();
        System.out.print("Enter addres:");
        String addres = scanner.next();


        InformationUser informationUser = new InformationUser();
        informationUser.setName(name);
        informationUser.setFamily(family);

        Addres addres1=new Addres();
        String[] addresAray = addres.split("-");
        addres1.setState(addresAray[0]);
        addres1.setCity(addresAray[1]);
        addres1.setStreet(addresAray[2]);
        addres1.setAlley(addresAray[3]);
        addres1.setPlak(addresAray[4]);

        informationUser.setAddres(addres1);

        informationUser.PrintInfo();



    }


}
