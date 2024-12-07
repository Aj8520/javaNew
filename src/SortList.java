import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// program to sort a List of Integers
public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(45);
        number.add(12);
        number.add(78);
        number.add(34);

        Collections.sort(number);

        System.out.println("sorted List: " + number);

        Collections.reverse(number);

        System.out.println(
                "Reversed List: " + number);

        // Program to Find Maximum and Minimum in a List

        int max = Collections.max(number);
        int min = Collections.min(number);

        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);

        // program to shuffle elements in a list

        Collections.shuffle(number);
        System.out.println("Shuffled List: " + number);
    }

}
