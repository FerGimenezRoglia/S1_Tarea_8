package Nivel_1.ejercicio6;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> integerAndStrings = List.of("Bicycle", "4", "Ball", "34", "8", "Table");

        List <String> sortedList = integerAndStrings.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        sortedList.forEach(System.out::println);

    }
}
