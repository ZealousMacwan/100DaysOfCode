// longest-consecutive-sequence
// https://leetcode.com/problems/longest-consecutive-sequence/submissions/1317836756/
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> myhash = new HashSet<>();
        int ans=0;
        for(int i=0; i<nums.length; i++){
            myhash.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            //if previous element not present means
            //it will be start of new sequence
            if(!myhash.contains(nums[i] -1)){
                int next = nums[i];
                while(myhash.contains(next)){
                    next++;
                }
                if(ans < next-nums[i])
                    ans = next - nums[i];
            }
        }
        return ans;
    }
}