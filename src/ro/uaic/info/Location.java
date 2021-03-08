package ro.uaic.info;

import java.util.HashMap;
import java.util.Map;

public class Location {
    protected String name;
    private Map<Location,Integer> cost= new HashMap<>();

    public Location(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addCost(Location location,Integer cost){
        this.cost.put(location,cost);
    }

}
