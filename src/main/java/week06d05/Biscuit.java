package week06d05;

public class Biscuit {
    private BiscuitType type;
    private int grammAmount;

    public Biscuit(BiscuitType type, int grammAmount) {
        this.type = type;
        this.grammAmount = grammAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGrammAmount() {
        return grammAmount;
    }

    public static Biscuit of(BiscuitType type, int grammAmount){
        return new Biscuit(type, grammAmount);
    }
}
