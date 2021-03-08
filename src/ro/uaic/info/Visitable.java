package ro.uaic.info;

public interface Visitable {
    boolean isOpen(int hour);
    int getOpeninghour();
    int getClosinghour();

    default void defaultHours(){

    }
}
