// https://leetcode.com/problems/running-sum-of-1d-array/
class Solution {
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        int runningSum = 0;

        //loop through each number and keep adding num to runningSum
        //for next number sum would be runningSum+num
        //save runningSum for each index num
        for(int i=0; i<n; i++){
            runningSum+=nums[i];
            ans[i] = runningSum;
        }
        return ans;
    }
}