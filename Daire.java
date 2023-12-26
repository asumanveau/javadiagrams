public class Daire extends Konut {

    private int apartmentNumber;

    int numberofFloors;


    public Daire ( String address,int numberofFloors,int apartmentNumber){
        super(address);

        this.apartmentNumber=getApartmentNumber();
        this.numberofFloors=numberofFloors;

    }

    public void displayInfo() {

        System.out.println("bilgi"+ getApartmentNumber());
    }

   public int compareTo(Daire other){


        if(this.apartmentNumber< other.apartmentNumber){
            return -1;

        }
        else if( this.apartmentNumber== other.getApartmentNumber()){
            return 0;

        }
        else  {
            return 1;
        }


   }


    public int getApartmentNumber() {
        return apartmentNumber;
    }
}

