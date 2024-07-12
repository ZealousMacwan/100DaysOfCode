// binary-search
// https://leetcode.com/problems/binary-search/
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;

        // recursive
        //return bs(nums, target, 0, nums.length-1);

    }

    // recursive
    /*
    public int bs(int[] nums, int target, int left, int right){
        if(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                return bs(nums, target, left, mid-1);
            else
                return bs(nums, target, mid+1, right);            
        }
        return -1;
    }
    */

}
