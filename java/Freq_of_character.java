import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String a = "aabbccdefg";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : a.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : freq.keySet()) {
            System.out.println(ch + " : " + freq.get(ch));
        }
    }
}
