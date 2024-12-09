package Nivel_1.ejercicio2;

import java.util.Arrays;
import java.util.List;

import static Nivel_1.ejercicio1.StringList.filterStrings;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Window", "school", "car", "Mountain");
        List<String> stringsWithFilter = filterStrings(strings);

        System.out.println(stringsWithFilter);

    }
}
