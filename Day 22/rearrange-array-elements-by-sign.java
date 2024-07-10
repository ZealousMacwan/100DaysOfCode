// rearrange-array-elements-by-sign
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int nextPosIndex = 0;
        int nextNegIndex = 1;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                ans[nextPosIndex] = nums[i];
                nextPosIndex+=2;
            }else{
                ans[nextNegIndex] = nums[i];
                nextNegIndex+=2;
            }
        }
        return ans;
    }
}
