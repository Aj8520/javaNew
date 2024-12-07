import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElements {
    // Program to Remove Elements While iterating (Using Iterator)
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println("List after removal: " + list);

    }

}
