package Nivel_1.ejercicio6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<Object> integerAndStrings = Arrays.asList("Bicycle", 4, "Ball", 34, 8, "Table");

        integerAndStrings.sort(Comparator.comparing(item -> {
            if (item instanceof String){
                return ((String) item).length();
            }
            return 0;
        }));
        integerAndStrings.forEach(System.out::println);

    }
}
