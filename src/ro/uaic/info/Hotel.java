package ro.uaic.info;

public class Hotel extends Location implements Payable,Classifiable{

    private String rank;//hotel, motel, hostel, etc

    public Hotel(String name) {
        super(name);
    }


    @Override
    public void printRank() {
        System.out.println(rank);
    }
}
