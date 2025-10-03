package chapter10.ObjectOrientedThinking.StackOfIntegers;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(stack.pop() + ", ");
        }
    }
}
