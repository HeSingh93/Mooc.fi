import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public void add(String value) {
        stackList.add(value);
    }

    public ArrayList<String> values(){
        return stackList;
    }

    public String take() {
        if (stackList.size() >= 1) {
            int position = stackList.size() - 1;
            String value = stackList.get(position);
            stackList.remove(position);
            return value;
        } else {
            return null;
        }
    }
}
