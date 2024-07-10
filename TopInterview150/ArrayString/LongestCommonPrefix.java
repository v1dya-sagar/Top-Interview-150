package TopInterview150.ArrayString;

import java.util.Arrays;

/**
 * created by : v1dya-sagar on 09-07-2024
 *
 * @author : v1dya-sagar
 * @date : 09-07-2024
 * @project : TopInterview150
 */
public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String s1 = strs[0];
            String s2 = strs[strs.length-1];
            int idx = 0;
            while(idx < s1.length() && idx < s2.length()){
                if(s1.charAt(idx) == s2.charAt(idx)){
                    idx++;
                } else {
                    break;
                }
            }
            return s1.substring(0, idx);
        }
    }
}
