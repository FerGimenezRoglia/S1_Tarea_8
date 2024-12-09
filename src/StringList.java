import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringList {

    public static List<String> filterStrings(List<String> strings) {

        return strings.stream()
                .filter(s -> s.toLowerCase().contains("o")).collect(Collectors.toList());

    }

}
