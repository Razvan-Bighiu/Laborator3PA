package ro.uaic.info;

public class Hotel extends Location implements Classifiable{

    private String rank;//hotel, motel, hostel, etc

    public Hotel(String name) {
        super(name);
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void printRank() {
        System.out.println(rank);
    }
}
