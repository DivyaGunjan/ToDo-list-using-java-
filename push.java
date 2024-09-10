import java.util.Stack;

public class push {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); // Creating a stack of integers

        s.push(1); // This pushes 1 to the stack top
        s.push(2); // This pushes 2 to the stack top
        s.push(3); // This pushes 3 to the stack top
        s.push(4); // This pushes 4 to the stack top
        s.push(5); // This pushes 5 to the stack top

        // Printing the stack in reverse order
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

        // The above loop prints "5 4 3 2 1"
    }
}
