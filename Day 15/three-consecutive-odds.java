// three-consecutive-odds
// https://leetcode.com/problems/three-consecutive-odds/?envType=daily-question&envId=2024-07-01
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count3=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count3=0;
            }else{
                count3++;
            }
            if(count3 == 3)
                return true;
        }
        return false;
    }
}