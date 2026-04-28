import java.util.HashMap;

public class ContaCaractere {
    public static void main(String[] args) {
        HashMap<String, Integer> contador = new HashMap<>();
        String texto = "Ola, mundo!";

        for (char c : texto.toCharArray()){
            String key = String.valueOf(c);
            contador.put(key, contador.getOrDefault(key, 0) + 1);
        }
        System.out.println(contador);
    }
}
