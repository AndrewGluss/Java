import java.util.Arrays;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < result.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return  result;
    }
}
