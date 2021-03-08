package ro.uaic.info;

public interface Visitable {
    boolean isOpen(int hour);
    int getOpeningHour();
    int getClosingHour();

    default void defaultHours(){

    }
}
