// https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        // find non zero one by one and put it
        // one by one, count zeroes along with
        // and place all remanining zeroes
        int zeroCounter = 0;
        int nonZeroIndex = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i] == 0){
                zeroCounter++;
            }else{
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for(int i=0; i<zeroCounter; i++){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}

/*
class Solution {
    public void moveZeroes(int[] nums) {
        // two pointer approach
        // one is to iterate
        // another is to put non-zero element in each iteration 
        // on that index
        int currentIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(nums[currentIndex]==0){
                    nums[currentIndex] = nums[i];
                    nums[i] = 0;
                    currentIndex++;
                }else{
                    currentIndex++;
                }
            }
        }
    }
}
*/