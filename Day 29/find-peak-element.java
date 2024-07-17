// find-peak-element
// https://leetcode.com/problems/find-peak-element/
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = nums.length - 1;

        if(n==1)
            return 0;
        if(nums[0] > nums[1])
            return 0;
        if(nums[right]>nums[right-1])
            return right;
        left = 1;
        right = right - 1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }    
        return -1;   
    }
}