package stacks;

public class Tester {
    
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(2);
        System.out.println(stack.isEmpty());
        stack.push(4);
        stack.push("Wurrier");
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
        for (int i = 0; i < 11; i++) {
            stack.push(i);
        }
    }
}
