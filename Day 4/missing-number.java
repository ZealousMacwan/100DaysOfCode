// https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        // as we have n number from 0 to n except the missing one
        // we know that we have formula to find sum of n numbers
        // so we can first find sum of nums in array and then sum of n numbers
        // the differnce would be the missing number
        int n = nums.length;
        int expectedSum = ( n * (n + 1))/2;
        int currentSum = 0;
        for(int i=0; i<n; i++) {
            currentSum+=nums[i];
        }
        return expectedSum - currentSum;     
    }
}