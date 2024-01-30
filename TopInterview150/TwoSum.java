package TopInterview150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public static int[] twoSum(int[] givenArray, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = givenArray.length;

        for (int i = 0; i < n; i++) {
            int complement = target - givenArray[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(givenArray[i], i);
        }

        return new int[]{}; // No solution found
    }
}
