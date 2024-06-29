// https://www.interviewbit.com/problems/pick-from-both-sides/submissions/

public class Solution {
    public int solve(int[] A, int B) {

        // sliding window approach
        // create a window of size b and calculate left side sum
        // slide the window on left side which adds new element on right side
        
        int leftSum = 0;
        int maxSum = 0;
        for(int i=0; i<B; i++){
            leftSum = leftSum + A[i];
            maxSum = leftSum;
        }
        
        for(int i=B-1,j=A.length-1; i>=0; i--,j--){
            leftSum = leftSum - A[i];
            leftSum = leftSum + A[j];
            maxSum = Math.max(leftSum, maxSum);
        }
        return maxSum;
    }
}