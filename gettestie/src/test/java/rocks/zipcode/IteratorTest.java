package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    private Iterator<Integer> iterate;
    private ArrayList<Integer> list;
    @Test
    public void IteratorNextTest(){
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(8);
    list.add(9);

    iterate = list.iterator();
        Assert.assertTrue(iterate.hasNext());
    }

    @Test
    public void IteratorNullTest(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(null);


        iterate = list.iterator();
        Assert.assertNull(iterate.next());

    }
}
