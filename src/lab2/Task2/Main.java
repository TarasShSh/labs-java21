package lab2.Task2;

public class Main {
    public static void main(final String[] args) {
        try {
            final Stack<Integer> stack = new LinkedList<>();

            System.out.println("Empty: " + stack.empty());

            System.out.println("Pushing elements...");
            stack.push(1);
            stack.push(0);
            stack.push(-1);
            stack.push(-2);

            System.out.println("Empty: " + stack.empty());

            System.out.println("Amount of items: " + stack.size());
            System.out.println("Element  -- -1 --  found at " + stack.search(-1));
            System.out.println("First element: " + stack.peek());

            stack.clear();
            System.out.println("Cleared");
            System.out.println("Empty: " + stack.empty());

            System.out.println("Pushing elements...");
            stack.push(1);
            stack.push(0);
            stack.push(-1);
            stack.push(-2);

            while (!stack.empty()) {
                System.out.println("Removed element: " + stack.pop() + " ");
            }

            final IterableLinkedList<String> iterableStack = new IterableLinkedList<>();

            System.out.println("Empty: " +  iterableStack.empty());

            iterableStack.push("first in");
            iterableStack.push( " - ");
            iterableStack.push("last out");

            System.out.println("Empty: " +  iterableStack.empty());

            System.out.println("Amount of items: " +  iterableStack.size());
            System.out.println("Element  --first in--  found at: " +  iterableStack.search("first in"));
            System.out.println("First element: " +  iterableStack.peek());

            for(final String value : iterableStack){
                System.out.println(value);
            }
        } catch (final RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
