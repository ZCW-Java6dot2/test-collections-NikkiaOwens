package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest{

    @Test
    public void LinkedTest(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Brat");
        list.remove("Brat");

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void LinkedRemoveFirstTest(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Brat");
        list.add("Barbie");
        list.add("Doll");

        System.out.println(list);
        list.removeFirst();

        System.out.println(list);
        Assert.assertFalse(list.contains("Brat"));

        //can remove last as well
    }

//linked list not working???


}
