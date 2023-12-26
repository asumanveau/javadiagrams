import java.util.ArrayList;


public class evSahibii {


     Bina buıl;
     String isim;

     String  soyisim;
     Daire apart;
     ArrayList<Daire> aparts;
    public evSahibii( String isim,String soyisim,Bina buıl) {
this.buıl=buıl;
this.isim=isim;
this.soyisim=soyisim;
aparts=new ArrayList<>();


    }

    public  void displayInfo(){
System.out.println("bina"+buıl+"isism:"+isim+"soyisim:"+soyisim);
}
public void addApartment(Daire apart){
aparts.add(apart);

}
}
