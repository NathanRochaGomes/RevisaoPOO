import java.util.ArrayList;
import java.util.List;

public class SomaLista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(23);
        numeros.add(45);
        numeros.add(67);
        numeros.add(12);


        int soma = numeros.stream()
        .mapToInt(Integer::intValue)
        .sum();


        System.out.println("Lista de números: " + numeros);
        System.out.println("Soma: " + soma);
    }
}
