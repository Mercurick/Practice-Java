
public enum Prices {
    STANDARD(100), PRO(200), LUX(300);

    private final int value;

    Prices(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
