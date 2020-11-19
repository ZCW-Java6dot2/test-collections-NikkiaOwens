package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {

    private Vector<String> vect;

    @Test
    public void VectorTest(){
        Vector<String> vect = new Vector<>();
       vect.add("Randy");
        vect.addElement("MArshc");

        Assert.assertTrue(vect.contains("Randy"));

    }
}
