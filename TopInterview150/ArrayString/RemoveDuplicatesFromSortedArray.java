package TopInterview150.ArrayString;

/**
 * created by : v1dya-sagar on 09-07-2024
 *
 * @author : v1dya-sagar
 * @date : 09-07-2024
 * @project : TopInterview150
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
