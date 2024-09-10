import java.util.Scanner;
import java.util.Stack;

public class bket {
    public static boolean checkValidParentheses(String exp) {
        Stack<Character> s = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
                continue;
            }
            if (s.isEmpty()) {
                return false;
            }
            char top = s.pop();
            if ((top == '(' && ch != ')') ||
                (top == '{' && ch != '}') ||
                (top == '[' && ch != ']')) {
                return false;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: ");
        String exp =sc.nextLine();
        if (checkValidParentheses(exp)) {
            System.out.println("The expression has balanced brackets.");
        } else {
            System.out.println("The expression does not have balanced brackets.");
        }
    }
}