package ro.uaic.info;

public class Church extends Location implements Visitable{

    private int[] openHours = new int[2];

    public Church(String name) {
        super(name);
    }

    public void setOpenHours(int openingHour,int closingHour) {//could be "addOpenHours" and "removeOpenhours" to add intervals
        this.openHours[0]=openingHour;
        this.openHours[1]=closingHour;
    }

    @Override
    public boolean isOpen(int hour) {
        return hour <= openHours[1] && hour <= openHours[0];
    }

    @Override
    public int getOpeningHour() {
        return this.openHours[0];
    }

    @Override
    public int getClosingHour() {
        return this.openHours[1];
    }
}
