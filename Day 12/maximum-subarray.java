// https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int subSum = nums[0];
        for(int i=1; i<nums.length; i++){
            subSum = subSum + nums[i];
            subSum = Math.max(nums[i], subSum);
            maxSum = Math.max(subSum, maxSum);
        }
        return maxSum;
    }
}