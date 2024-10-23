import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;
public class Occurance {
    public static void main(String[] args) {
        String input = "I live in Dhaka";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        List<Map.Entry<Character, Integer>> sortedEntries = charCountMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        System.out.println("Character total:");
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
