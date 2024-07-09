package TopInterview150.ArrayString;

class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1,2,3,4,5}));
    }
    public static boolean canJump(int[] nums) {
        int maxDistance = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > maxDistance)
                return false;
            maxDistance = Math.max(maxDistance, i + nums[i]);
        }
        return true;
    }
}