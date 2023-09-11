// 1. Print duplicate characters from String?
package strings;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "tata";
        Map<Character, Integer> charCount = new HashMap<>();

        str = str.toLowerCase();

        for(char c: str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
