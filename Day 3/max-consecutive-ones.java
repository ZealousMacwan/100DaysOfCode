// https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // hints from q
        // binary array (only 0 and 1)
        // return max of consecutive 1s
        int max = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                    count++;
                    max = Math.max(count,max);
            }else{
                count=0;
            }
        }
        return max;
    }
}