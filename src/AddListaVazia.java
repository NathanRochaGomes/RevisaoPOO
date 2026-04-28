import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddListaVazia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();


        int i = 0;
        while (i < 5) {
             System.out.println("Digite seu nome: ");
             String nome = scanner.nextLine();
              listaNomes.add(nome);
              i++;  
        }

        scanner.close();
        System.out.println("Nomes na lista: " + listaNomes);
    }
}