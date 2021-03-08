package ro.uaic.info;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private List<Location> locations = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocations(Location name) {
        this.locations.add(name);
    }

    public void printLocations(){
        for(int i=0;i<locations.size();i++){
            System.out.println(locations.get(i).name);
        }
    }

}
