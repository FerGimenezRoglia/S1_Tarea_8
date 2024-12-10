package Nivel_1.ejercicio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> integerAndStrings = Arrays.asList("Bicycle", 4, "Ball", 34, 8, "Table");

        integerAndStrings.sort(Comparator.comparing((Object item) ->
                item instanceof String ? ((String) item).length() : -1).reversed());

        integerAndStrings.forEach(System.out::println);

    }

}
