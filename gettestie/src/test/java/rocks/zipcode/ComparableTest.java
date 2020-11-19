package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest{
    private final PersonCompare personCompare = new PersonCompare();
    @Test
    public void testEqual(){
        Person yolo = new Person("Yolo");
        Person free = new Person("Free");

        int result = personCompare.compare(yolo, free);

        Assert.assertEquals(0, result);
    }

}
