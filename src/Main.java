public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        System.out.println(stack.pop());
        stack.push(5);
        stack.push(0);
        stack.push(-2);
        stack.push(7);
        System.out.println(stack);
        System.out.println(stack.pop());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        stack.push(-2);
        System.out.println(stack);
        stack.pop();
    }
}