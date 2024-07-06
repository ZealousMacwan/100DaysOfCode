// subarray-sum-equals-k
// https://leetcode.com/problems/subarray-sum-equals-k/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        //for element itself
        sumMap.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sumMap.containsKey(sum - k)){
                count = count + sumMap.get(sum - k);
            }
            sumMap.put(sum, sumMap.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}