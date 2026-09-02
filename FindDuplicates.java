import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}
