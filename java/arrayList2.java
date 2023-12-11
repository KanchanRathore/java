import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class arrayList2 {
    public static void main(String[] args) {
        // Access and print out the Objects
        List<String> names = new ArrayList<>();
        for (int j = 0; j < names.size(); j++) {
            System.out.println("element " + j + ": " + names.get(j));
        }
        /*Set<String> s;
        s = new HashSet<String>();
// Similarly TreeSet/LinkedHashSet ...

        s.add("Sandwich");
        s.add("Ice Cream");

        Iterator<String> it;
        it = s.iterator();
        while (it.hasNext()) System.out.println(it.next());*/
    }
}