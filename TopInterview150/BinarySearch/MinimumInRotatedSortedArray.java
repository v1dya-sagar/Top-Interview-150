package TopInterview150.BinarySearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println( findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }
    public static int findMin(int[] nums){
        int left = 0, right = nums.length - 1;
        if(nums[left] < nums[right])
            return nums[left];
        int mid = (left + right)/2;
        if(nums[left] < nums[mid]){
            left = mid + 1;
        } else {
            right = mid;
        }
        return nums[left];
    }
}
