package TopInterview150.KadanesAlgorithm;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int j : arr) {
            currentSum += j;
            maxSum = Math.max(currentSum, maxSum);

            if (currentSum < 0)
                currentSum = 0;
        }
        System.out.println(maxSum);
    }
}
