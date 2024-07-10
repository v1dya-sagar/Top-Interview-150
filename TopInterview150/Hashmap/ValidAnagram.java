package TopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * created by : v1dya-sagar on 09-07-2024
 *
 * @author : v1dya-sagar
 * @date : 09-07-2024
 * @project : TopInterview150
 */
public class ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            Map<Character, Integer> count = new HashMap<>();

            // Count the frequency of characters in string s
            for (char x : s.toCharArray()) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }

            // Decrement the frequency of characters in string t
            for (char x : t.toCharArray()) {
                count.put(x, count.getOrDefault(x, 0) - 1);
            }

            // Check if any character has non-zero frequency
            for (int val : count.values()) {
                if (val != 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
