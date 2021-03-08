package ro.uaic.info;

public class Restaurant extends Location implements Classifiable{

    private String rank;//Restaurant, fast-food, buffet, etc...

    public Restaurant(String name) {
        super(name);
    }

    @Override
    public void printRank() {
        printRank();
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
