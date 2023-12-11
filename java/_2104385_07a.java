import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class _2104385_07a {

    public static void main(String[] args) {
        int N = 5_00_000; // Size of the collection

        // Create ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Fill both lists with random integers
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            linkedList.add(value);
        }

        // Measure insertion and deletion times
        long startTime, endTime, duration;

        // Insertion at front
        startTime = System.nanoTime();
        arrayList.add(0, 999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList Front Insertion Time: " + duration + " ns");

        startTime = System.nanoTime();
        linkedList.add(0, 999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList Front Insertion Time: " + duration + " ns");

        // Insertion at middle
        int midIndex = N / 2;
        startTime = System.nanoTime();
        arrayList.add(midIndex, 999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList Middle Insertion Time: " + duration + " ns");

        startTime = System.nanoTime();
        linkedList.add(midIndex, 999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList Middle Insertion Time: " + duration + " ns");

        // Insertion at end
        startTime = System.nanoTime();
        arrayList.add(999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList End Insertion Time: " + duration + " ns");

        startTime = System.nanoTime();
        linkedList.add(999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList End Insertion Time: " + duration + " ns");

        // Deletion at front
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList Front Deletion Time: " + duration + " ns");

        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList Front Deletion Time: " + duration + " ns");

        // Deletion at middle
        startTime = System.nanoTime();
        arrayList.remove(midIndex);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList Middle Deletion Time: " + duration + " ns");

        startTime = System.nanoTime();
        linkedList.remove(midIndex);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList Middle Deletion Time: " + duration + " ns");

        // Deletion at end
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList End Deletion Time: " + duration + " ns");

        startTime = System.nanoTime();
        linkedList.remove(linkedList.size() - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList End Deletion Time: " + duration + " ns");

        // Determine maximum ArrayList size
        int maxArrayListSize = Integer.MAX_VALUE;
        while (true) {
            try {
                ArrayList<Integer> testList = new ArrayList<>(maxArrayListSize);
                maxArrayListSize--;
            } catch (OutOfMemoryError e) {
                break;
            }
        }

        System.out.println("Maximum ArrayList size supported: " + maxArrayListSize);

    }
}


