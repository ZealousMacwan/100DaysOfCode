// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        
        //unique pointer
        //uPointer
        
        //check pointer
        //cPointer
        
        // counter for unique, atleast 1 length so 1 unique
        int k = 1;

        for(int uPointer=0, cPointer=0; cPointer<=nums.length-1; cPointer++){
            // if both are different means we have found a new unique
            if(nums[uPointer] != nums[cPointer]){
                k++;
                // prepare a place if need to shift, also increase unique counter pointer
                uPointer++;
                // possible that both pointer are on same element in case of all unique
                // if both are not at same place it needs to swaped to right next place
                if(uPointer != cPointer){
                    int temp = nums[cPointer];
                    nums[cPointer] = nums[uPointer];
                    nums[uPointer] = temp;
                }
            }
        }
        return k;        
    }
}