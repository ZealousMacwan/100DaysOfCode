// find-the-duplicate-number
// https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer, Integer> ansMap = new HashMap<>();
       for(int i=0; i<nums.length; i++){
        if(ansMap.containsKey(nums[i]))
            return nums[i];
        else
            ansMap.put(nums[i],1);
       }
       return -1;
    }
}