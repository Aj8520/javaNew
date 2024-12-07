import java.util.ArrayList;
import java.util.Iterator;

// Program to iterate Over an ArrayList
public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        // using enhanced for -loop
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

}
