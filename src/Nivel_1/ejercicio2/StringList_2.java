package Nivel_1.ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class StringList_2 {

    public static List<String> filterStrings_2(List<String> strings) {

        return strings.stream()
                .filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}
