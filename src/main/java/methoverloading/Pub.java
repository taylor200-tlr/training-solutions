package methoverloading;

public class Pub {
    private String name;
    private int hours, minutes;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return name + ", " + hours + ", " + minutes;
    }
}
