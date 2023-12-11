import java.util.ArrayList;
import java.util.List;

public class trying {
    public static void main(String[] args) {
    List<String> names = new ArrayList<String>(2);
// LinkedList<Integer> llist = new LinkedList<Integer>();

// Capacity starts at 10, but size starts at 0
System.out.println("Initial size: " + names.size());

// Add some String references
            names.add("Zelensky");
            names.add("Biden");
            names.add("Sunak");
            System.out.println("Size after additions: " + names.size());
}
}
