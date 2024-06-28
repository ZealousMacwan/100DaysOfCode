// https://www.interviewbit.com/problems/sort-array-with-squares/

public class Solution {
    public int[] solve(int[] A) {
        for(int i=0; i<A.length; i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
