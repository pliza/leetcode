public class RunningSum {
    
    class Solution {
        public int[] runningSum(int[] nums) {
            int acc = 0;
            for (int i=0; i < nums.length ; i ++) { 
                acc += nums[i];
                nums[i] = acc;
            }
            return nums;
        }
    }
}
