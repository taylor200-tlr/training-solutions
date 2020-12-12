package interfaces.animal;

public class Duck implements Animal{
    private String name;
    private int numberOfLegs;

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
