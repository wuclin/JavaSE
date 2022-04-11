import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class HashaTreeSet {
    public static void main(String[] args){
        Collection<String> c1 = new HashSet<>();
        Collection<String> c2 = new TreeSet<>();

        c1.add("Bob");c1.add("Amy");c1.add("Carl");
        c2.add("Bob");c2.add("Amy");c2.add("Carl");

        System.out.println("HashSet:");
        for (String i : c1)
            System.out.print(i+",");
        System.out.println("");
        System.out.println("TreeSet:");
        for (String i : c2)
            System.out.print(i+",");

    }
}
