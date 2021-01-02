package schoolrecords;

public enum MarkType {
    A(5, "Kiváló"), B(4, "Jó"), C(3, "Közepes"),
    D(2, "Elégséges"), F(1, "Bukás");

    private int value;              //esetleg final?
    private String description;     //esetleg final?

    MarkType(int value, String description) {
        if (value < 1 || value > 5) {
            throw new IllegalArgumentException("Nem megfekekő osztályzat");
        }
        this.value = value;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}
