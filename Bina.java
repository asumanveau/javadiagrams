public class Bina extends Konut{

    private int numberofFloors;

    public Bina ( String address,int numberofFloors){
        super(address);


        this.setNumberofFloors(numberofFloors);

    }



    public void displayInfo() {
System.out.println("bilgi"+ getNumberofFloors());

super.displayInfo();
System.out.println("");
}


    public int getNumberofFloors() {
        return numberofFloors;
    }

    public void setNumberofFloors(int numberofFloors) {
        this.numberofFloors = numberofFloors;
    }
}

