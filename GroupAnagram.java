import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            char[] s = input[i].toCharArray();
            Arrays.sort(s);
            String key = new String(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(input[i]);
        }
        System.out.println(map.values());
    }
}
