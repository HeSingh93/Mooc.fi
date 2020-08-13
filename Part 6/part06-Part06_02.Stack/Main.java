
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        stack.add("Value");

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
    }
}
