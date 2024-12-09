package Nivel_1.ejercicio5;

public class Main {
    public static void main(String[] args) {

        PiValue piValue = () -> 3.1415;

        double pi = piValue.getPiValue();

        System.out.println("Pi value is: " + pi);

    }
}
