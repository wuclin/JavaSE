import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class paixu {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(38, "Ming"));
        people.add(new Person(25,"Hong"));
        people.add(new Person(43, "Bai"));
        Collections.sort(people);
        System.out.println(people.toString());

    }
}
