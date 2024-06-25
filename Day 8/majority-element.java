// https://leetcode.com/problems/majority-element/

// boyer moore majority voting 1ms
// time O(n) space O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int votes = 1;
        for(int i=1; i<nums.length; i++){
            if(votes == 0){
                votes++;
                majorityElement = nums[i];
            }
            else if(majorityElement == nums[i])
                votes++;
            else
                votes--;   
        }
        return majorityElement;
    }
}

// hashmap solution 15ms
// time O(n) space O(n)
class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        HashMap<Integer, Integer> ansMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(ansMap.containsKey(nums[i])){
                int currentCount = ansMap.get(nums[i]);
                ansMap.put(nums[i],currentCount+1);
            }else{
                ansMap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: ansMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > (nums.length/2)){
                ans = key;
                return ans;
            }
        }
        return -1;
    }
}
