package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    Map<String, Integer> treeMap;

    @Test
    public void TreeMTest(){

        Map<String, Integer> treeMap = new TreeMap<String, Integer>();

        treeMap.put("Lalala", 40);
        treeMap.get("Lalala");
        Integer expected = 40;
        Integer actual = treeMap.get("Lalala");

        Assert.assertEquals(actual, expected);
    }
}
