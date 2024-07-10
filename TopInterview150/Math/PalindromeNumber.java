package TopInterview150.Math;

/**
 * created by : v1dya-sagar on 10-07-2024
 *
 * @author : v1dya-sagar
 * @date : 10-07-2024
 * @project : TopInterview150
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        // if no flaws are found we return true
        return true;
    }
}
