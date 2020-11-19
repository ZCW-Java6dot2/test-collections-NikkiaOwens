package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    private HashSet<String> hashSet;

    @Test
    public void HashSetTests(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Randy");
        hashSet.clear();

        Assert.assertTrue(hashSet.isEmpty());
    }

}
