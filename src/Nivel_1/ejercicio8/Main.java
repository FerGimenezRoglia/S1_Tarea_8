package Nivel_1.ejercicio8;

public class Main {
    public static void main(String[] args) {

        ReverseString reverser = input -> new StringBuilder(input).reverse().toString();

        String original = "f e d c b a";
        String reversed = reverser.reverse(original);

        System.out.println(original);
        System.out.println(reversed);

    }
}
