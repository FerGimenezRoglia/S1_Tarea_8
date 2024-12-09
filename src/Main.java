import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Apple", "car", "house", "Tree", "Book");
        List<String> stringWith_o = StringList.filterStrings(strings);
        System.out.println(stringWith_o);

    }
}