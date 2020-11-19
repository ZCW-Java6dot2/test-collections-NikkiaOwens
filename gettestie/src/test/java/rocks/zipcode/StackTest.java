package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {
    private Stack<Integer> stack;

    @Test
    public void StackOneTest(){
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        Integer expected = 4;
        Integer actual = stack.peek();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void StackPopTest(){
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        Integer expected = 4;
        Integer actual = stack.peek();

        Assert.assertEquals(actual, expected);

    }
}
