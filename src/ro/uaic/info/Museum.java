package ro.uaic.info;

public class Museum extends Location implements Payable,Visitable{

    private int[] openHours;//ex: openHours[0]= opening hour -> 0800
    private float price;

    public Museum(String name) {
        super(name);
    }

    public void setOpenHours(int openingHour,int closingHour) {//could be "addOpenHours" and "removeOpenhours" to add intervals
        this.openHours[0]=openingHour;
        this.openHours[1]=closingHour;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean isOpen(int hour) {
        if(hour <= openHours[1] && hour <= openHours[0]){
            return true;
        }
        else
            return false;
    }

    @Override
    public int getOpeninghour() {
        return this.openHours[0];
    }

    @Override
    public int getClosinghour() {
        return this.openHours[1];
    }

    @Override
    public float getPrice(){
        return this.price;
    }

}
