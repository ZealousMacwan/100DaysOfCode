// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
class Solution{

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        // analyze question
        // given K
        // find longest subarray
        // whos sum is K
        int prefixSum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        for(int i=0; i<N; i++){
            prefixSum+=A[i];
            if(prefixSum == K){
                // i starts with 0 so +1
                maxLength = i+1;
            }
            else if(prefixSumMap.containsKey(prefixSum - K)){
                int lengthOfPrevious = prefixSumMap.get(prefixSum - K);
                int currentLength = i - lengthOfPrevious;
                maxLength = Math.max(maxLength, currentLength);
            }
            if(!prefixSumMap.containsKey(prefixSum)){
                prefixSumMap.put(prefixSum,i);
            }
        }
        return maxLength;
        
    }
}