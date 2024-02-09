package TopInterview150.ArrayString;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,1,1,3,3}; // o/p : 3
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
    }
}
