package rocks.zipcode;

import java.util.Comparator;

public class PersonCompare implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
