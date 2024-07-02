package TopInterview150.TwoPointers;

import java.util.Arrays;

public class TwoSumWithArraySorted {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (nums[l] + nums[r] != target) {
            // increase and decrease the sum based on l and r, as it is compared with the target.
            if (nums[l] + nums[r] < target)
                l++;
            else
                r--;
        }

        return new int[] {l+1, r+1};
    }
}
