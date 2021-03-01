package ro.uaic.info;

import java.util.List;

public class City {

    private String name;
    private List<Location> locations;

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

    public void addLocations(String name) {
        this.locations.add(new Location(name));
    }

}
