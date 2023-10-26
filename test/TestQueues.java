import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestQueues {

    @Test
    public void TestAddAndRemove() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(5);
        stack.push(0);
        stack.push(-2);
        stack.push(7);

        assertThat(stack.toString(), is("[5, 0, -2, 7]"));
        assertThat(String.valueOf(stack.pop()), is("7"));

        stack.pop();
        assertThat(stack.toString(), is("[5, 0]"));
        assertThat(String.valueOf(stack.peek()), is("0"));
        assertThat(String.valueOf(stack.peek()), is("0"));
        assertThat(String.valueOf(stack.peek()), is("0"));
        assertThat(stack.toString(), is("[5, 0]"));
        stack.push(5);
        assertThat(stack.toString(), is("[5, 0, 5]"));
        stack.pop();
        assertThat(stack.toString(), is("[5, 0]"));
        stack.push(-2);
        assertThat(stack.toString(), is("[5, 0, -2]"));
        stack.pop();
        assertThat(stack.toString(), is("[5, 0]"));
    }

    @Test
    public void testReverse() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(5);
        stack.push(0);
        stack.push(-2);
        stack.push(7);

        stack.reverse();
        assertThat(stack.toString(), is("[7, -2, 0, 5]"));
        stack.pop();
        stack.pop();
        assertThat(stack.toString(), is("[7, -2]"));
        stack.reverse();
        assertThat(stack.toString(), is("[-2, 7]"));

    }

    @Test
    public void testSearch() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(5);
        stack.push(0);
        stack.push(-2);
        stack.push(7);
        stack.push(-2);
        stack.push(8);

        assertThat(String.valueOf(stack.search(-2)), is("2"));
        stack.reverse();
        assertThat(String.valueOf(stack.search(-2)), is("3"));
        assertThat(String.valueOf(stack.search(9)), is("-1"));
    }
    @Test
    public void testFindMultiple() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(5);
        stack.push(5);
        stack.push(0);
        stack.push(-2);
        stack.push(7);
        stack.push(-2);
        stack.push(-2);
        stack.push(8);
        stack.push(8);

        assertThat(String.valueOf(stack.findMultiple()), is("-2"));
        stack.reverse();
        assertThat(String.valueOf(stack.findMultiple()), is("-2"));
        stack.push(8);
        stack.push(8);
        assertThat(String.valueOf(stack.findMultiple()), is("8"));
    }
}
