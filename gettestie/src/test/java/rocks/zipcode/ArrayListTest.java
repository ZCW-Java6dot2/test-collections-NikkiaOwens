package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListTest {
    private ArrayList<String> array;

    @Test
    public void ArrayTest(){
        ArrayList<String> array = new ArrayList<>();
        array.add("Randy");
        array.clear();

        Assert.assertTrue(array.isEmpty());

    }
}
