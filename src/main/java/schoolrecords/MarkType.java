package schoolrecords;

public enum MarkType {
    A(5, "excellent"),
    B(4, "very good "),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

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
