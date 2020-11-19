package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {

    private HashMap<String, Integer> hashMap;

    @Test
    public void testHashMapContainsKey(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Joan", 40);


        Assert.assertTrue(hashMap.containsKey("Joan"));

    }

    @Test
    public void testHashMapContainsValue(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Joan", 40);


        Assert.assertTrue(hashMap.containsValue(40));
    }



}
