package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    private ArrayDeque aDeq;

    @Test
    public void arrayDeqTest(){
        ArrayDeque<String> aDeq = new ArrayDeque<>();

        aDeq.add("This ian and array dEq");
        Assert.assertFalse(aDeq.isEmpty());
    }
}
