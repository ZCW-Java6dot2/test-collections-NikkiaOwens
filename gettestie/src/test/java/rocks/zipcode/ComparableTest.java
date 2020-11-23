package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest{
    private final PersonCompare personCompare = new PersonCompare();
    @Test
    public void testEqual(){
        Person yolo = new Person("Yolo", 1998);
        Person free = new Person("Free", 1997);

       // ArrayList<String> pls = new ArrayList<String>();
        Person[] people = {yolo, free};
//        pls.add(yolo.getName());
//        pls.add(free.getName());

        Comparator comparator = new PersonCompare();
        Arrays.sort(people, comparator);
        //System.out.println(pls);

        //int result = yolo.compareTo(free);

        Assert.assertEquals(yolo, people[1]);
        //greater, return positive number
        // equal, return 0
        // less, return negative number
    }

}
