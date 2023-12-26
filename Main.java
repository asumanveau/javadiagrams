import java.awt.*;

public class Main {
    public Main(){

    }
    public static void main(String[] args) {
        Bina bina = new Bina("istanbul", 5);



        Daire apart = new Daire("pendik", 101, 1);
        Daire apart1= new Daire("kartal", 102, 1);

        evSahibii evSahibiii = new evSahibii("asuman", "genç", bina);
        evSahibiii.addApartment(apart);
        evSahibiii.addApartment(apart1);

        Kiraci kiraci = new Kiraci("asuman", "genç", evSahibiii);
        System.out.println("bina bilgileri");
        bina.displayInfo();
System.out.println("daire bilgileri");
       apart.displayInfo();
        System.out.println("daire bilgileri");
        apart1.displayInfo();
        System.out.println("evsahibi bilgileri");
        evSahibiii.displayInfo();
        System.out.println("kiracı bilgileri");
        kiraci.displayInfo();
    }}