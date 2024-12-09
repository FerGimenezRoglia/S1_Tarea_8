package Nivel_1.ejercicio1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Apple", "car", "house", "Tree", "Book");
        List<String> stringWithFilter = StringList.filterStrings(strings);
        System.out.println(stringWithFilter);

    }
}