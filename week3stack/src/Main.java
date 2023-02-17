import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> mystack = new Stack<>();
        CustomStack<Integer> stack1 = new CustomStack<>();

        int num;
        Double num2;
        Double num3 = Double.parseDouble("5.5");

        stack1.push(99);

        for (int i =1; i<7; i++) {
            mystack.push(i);
        }

        System.out.println("I am peeking: " + mystack.peek());
        System.out.println("I am popping: " + mystack.pop());
        System.out.println("I am peeking: " + mystack.peek());
        System.out.println("peeking custom stack: " + stack1.peek());

    }
}