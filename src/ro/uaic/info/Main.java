package ro.uaic.info;

public class Main {

    public static void main(String[] args) {

        City iasi = new City("Iasi");

        Hotel v1 = new Hotel("Hotel");
        v1.setRank("Hotel");

        Museum v2 = new Museum("Museum A");
        v2.setPrice(12);
        v2.setOpenHours(800,1800);

        Museum v3 = new Museum("Museum B");
        v3.setPrice(20);
        v3.setOpenHours(900,1800);

        Church v4 = new Church("Church A");
        v4.setOpenHours(600,1300);

        Church v5 = new Church("Church B");
        v5.setOpenHours(600,1300);

        Restaurant v6 = new Restaurant("Restaurant");
        v6.setRank("Fast-food");

        iasi.addLocations(v1);
        iasi.addLocations(v2);
        iasi.addLocations(v3);
        iasi.addLocations(v4);
        iasi.addLocations(v5);
        iasi.addLocations(v6);

        v1.addCost(v2,10);
        v1.addCost(v3,50);

        v2.addCost(v3,20);
        v2.addCost(v4,20);
        v2.addCost(v5,10);

        v3.addCost(v4,20);

        v4.addCost(v5,30);
        v4.addCost(v6,10);

        v5.addCost(v6,20);
    }
}
