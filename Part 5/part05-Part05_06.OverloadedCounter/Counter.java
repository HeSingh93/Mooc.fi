public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}