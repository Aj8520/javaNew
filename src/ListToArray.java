
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Program to Convert List to Array
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("C++");
        list.add("java");

        System.out.println(list.size());
        String[] array = new String[list.size()];
        list.toArray(array);

        for (String lang : array) {
            System.out.println(lang);
        }

        // Convert Array to List
        List<String> list3 = Arrays.asList(array);
        System.out.println("List " + list3);

        // Program to Remove Duplicates from a List
        Set<String> set = new HashSet<>(list);
        System.out.println("list without duplicates" + set);

        // Program to Merge Two Lists
        List<String> list2 = new ArrayList<>();
        list2.add("marathi");
        list2.add("English");

        list.addAll(list2);

        System.out.println("Merged List " + list);

        // Program to find frequeccy of an Element in a List
        int frequeccy = Collections.frequency(list, "java");
        System.out.println("Frequency of 'Java': " + frequeccy);

    }

}
