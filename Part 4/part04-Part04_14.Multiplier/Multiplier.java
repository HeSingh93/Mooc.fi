public class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        return this.number * number;
    }
}
