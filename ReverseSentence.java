import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseSentence {
    public static void main(String[] args) {
        String Sentence = "Java is very Powerful";

        String reversed = Arrays.stream(Sentence.split(" "))
        .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    Collections.reverse(list);
                    return String.join(" ", list);
                }
        ));

        System.out.println(reversed);
    }

}
