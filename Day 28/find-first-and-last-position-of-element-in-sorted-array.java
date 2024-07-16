// find-first-and-last-position-of-element-in-sorted-array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = nums.length - 1;
        ans[0] = bsIndex1(nums, start, end, target);
        ans[1] = bsIndex2(nums, start, end, target);
        return ans;
    }
    public int bsIndex1(int[] nums, int start, int end, int target){
        int index1 = -1;
        while(start<=end){
            int mid = (start+end) / 2;
            if(target == nums[mid])
                index1= mid;
            if(target<=nums[mid])
                end = mid-1;
            else
                start = mid+1;
        }    
        return index1;
    }
    public int bsIndex2(int[] nums, int start, int end, int target){
        int index2 = -1;
        while(start<=end){
            int mid = (start+end) / 2;
            if(target == nums[mid])
                index2= mid;
            if(target>=nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }    
        return index2;
    }
}