package ro.uaic.info;

public class Church extends Location implements Visitable{

    private int[] openHours;

    public Church(String name) {
        super(name);
    }

    public void setOpenHours(int openingHour,int closingHour) {//could be "addOpenHours" and "removeOpenhours" to add intervals
        this.openHours[0]=openingHour;
        this.openHours[1]=closingHour;
    }

    @Override
    public boolean isOpen(int hour) {
            if(hour <= openHours[1] && hour <= openHours[0]){
                return true;
            }
            else
                return false;
    }
}
