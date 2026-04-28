import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QtdePar {
    public static void main(String[] args) throws Exception {
        
      List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);

        List<Integer> parNumbers = numbers.stream()
        .filter(n -> n.intValue() % 2 == 0)
        .collect(Collectors.toList());
        System.out.println(parNumbers);
    }
}