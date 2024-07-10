package TopInterview150.Hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * created by : v1dya-sagar on 09-07-2024
 *
 * @author : v1dya-sagar
 * @date : 09-07-2024
 * @project : TopInterview150
 */
public class HappyNumber {
    public boolean isHappyUsingSet(int n) {
        // Create a set to keep track of the numbers that have already been seen
        Set<Integer> seen = new HashSet<>();

        // Loop until either n becomes 1 (in which case n is a happy number) or n is seen again (in which case n is not a happy number)

        while (n != 1 && !seen.contains(n)) {
            // Add n to the set of seen numbers
            seen.add(n);

            // Compute the sum of the squares of the digits of n
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            // Update n with the sum of the squares of its digits

            n = sum;
        }

        // If n is 1, it is a happy number; otherwise, it is not
        return n == 1;
    }
    public boolean isHappyUsingSlowFast(int n) {

        int slow = n;
        int fast = n;
//while loop is not used here because initially slow and
//fast pointer will be equal only, so the loop won't run.
        do {
//slow moving one step ahead and fast moving two steps ahead

            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

//if a cycle exists, then the number is not a happy number
//and slow will have a value other than 1

        return slow == 1;
    }

//Finding the square of the digits of a number

    public int square(int num) {

        int ans = 0;

        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }

        return ans;
    }
}
