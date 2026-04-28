import java.util.HashMap;
import java.util.ArrayList;

public class DicionarioNotas {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> alunos = new HashMap<>();

        ArrayList<Double> notasNathan = new ArrayList<>();
        notasNathan.add(8.5);
        notasNathan.add(9.0);
        notasNathan.add(5.0);
        alunos.put("Nathan", notasNathan);

        System.out.println("Notas de Nathan: " + alunos.get("Nathan"));
        System.out.println("Primeira nota de Nathan: " + alunos.get("Nathan").get(0));
    }
}
