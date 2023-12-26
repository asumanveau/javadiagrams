import java.awt.desktop.SystemSleepEvent;

public abstract class Konut {

    String address;

   Konut( String address){
        this.address=address;

    }
    public void displayInfo() {
System.out.println("bilgi"+ address);

    }


}
