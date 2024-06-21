// https://leetcode.com/problems/single-number/
// brute force
class Solution {
    public int singleNumber(int[] nums) {
          if(nums.length==1){
            return nums[0];
            }
        int min = -1;
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
        }
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=-1){
                return nums[i];
            }
        }
        return -1;
    }
}
