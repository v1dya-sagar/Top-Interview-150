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
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1)
            return true;
        Map<Character, Character> hashmap = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i), y = t.charAt(i);
            if(hashmap.containsKey(x)){
                if(hashmap.get(x).equals(y)){
                    continue;
                }
                else{
                    return false;
                }
            } else{
                if(!hashmap.containsValue(y)){
                    hashmap.put(x,y); // might be unique character in second string
                }
                else{
                    return false;
                }
            }

        }
        return true;
    }
}
