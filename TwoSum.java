import java.util.Arrays;

public class TwoSum {
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));

    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i]+nums[j]== target && i!=j){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
