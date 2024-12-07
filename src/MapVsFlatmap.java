import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatmap {
    /*
     * In a nutshell, ‘map’ is your elegant transformer,
     * and ‘flatMap’ is your nested ninja
     */

    public static void main(String[] args) {

        List<String> languages = Arrays.asList("java", "Python", "JavaScript");
        List<String> uppercasedLanguages = languages.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercasedLanguages);

        List<List<String>> nestedList = Arrays.asList(Arrays.asList("java", "c#"), Arrays.asList("reactjs", "flutter"),
                Arrays.asList("mangoDB", "couchbase"));
        List<String> flattedList = nestedList.stream().flatMap(List::stream).map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(flattedList);
    }

}
