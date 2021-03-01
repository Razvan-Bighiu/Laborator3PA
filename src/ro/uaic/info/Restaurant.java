package ro.uaic.info;

public class Restaurant extends Location implements Payable,Classifiable{

    private String rank;//Restaurant, fast-food, buffet, etc...

    public Restaurant(String name) {
        super(name);
    }

    @Override
    public void printRank() {
        printRank();
    }
}
