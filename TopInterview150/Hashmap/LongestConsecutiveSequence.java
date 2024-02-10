package TopInterview150.Hashmap;


import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 1, 200, 4, 3, 5, 2};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int count = 0;
        int maxCount = 0;

        for (int element : set) {

            if (!set.contains(element - 1)) {
                count = 1;
                int index = element;

                while (set.contains(index + 1)) {
                    count++;
                    index++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }
}
