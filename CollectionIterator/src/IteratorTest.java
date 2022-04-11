import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args){
        Collection<String> c = new ArrayList<>();
        c.add("这");
        c.add("这");
        Iterator<String> i = c.iterator();

        /*remove 方法*/
       // i.remove();
        i.next();
        i.remove();
       /*  while (i.hasNext()){
            String s = i.next();
            System.out.println(s);
        }
        System.out.println("done");

        for (String e : c){
            System.out.println(e);
        }
        System.out.println("done");
        */

    }
}
