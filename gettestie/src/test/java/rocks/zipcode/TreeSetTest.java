package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    public TreeSet<Integer> trees;

    @Test
    public void TreeSetAddTest(){
        TreeSet<Integer> trees = new TreeSet<>();
        trees.add(5);

        Assert.assertTrue(trees.contains(5));
    }
}
