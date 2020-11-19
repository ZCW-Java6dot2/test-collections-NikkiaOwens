package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    private PriorityQueue prio;

    @Test
    public void PrioQueueAdd (){
        PriorityQueue<Integer> prio = new PriorityQueue<>();

        Integer expected = 9;

        prio.add(expected);

        Assert.assertTrue(prio.contains(expected));

    }

    @Test
    public void PrioQueuePeek(){
        PriorityQueue<Integer> prio = new PriorityQueue<>();

        Integer expected = 9;

        prio.add(expected);
        Integer actual = prio.peek();

        Assert.assertEquals(actual, expected);

    }
}
