// maximum-of-all-subarrays-of-size-k3101
// https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int max = arr[0];
        int pIndex = 0;
        for(int i=1;i<k;i++){
            if(arr[i]>max){
                max = arr[i];
                pIndex = i;
            }
        }
        ans.add(max);
        int i=1;
        for(int j=i+k-1;j<n;j++){
            if(pIndex>=i){
                if(arr[i+k-1]>max)
                    max=arr[i+k-1];
            }else{
                max=arr[i];
                for(int l=i+1; l<=j; l++){
                    if(arr[l]>max){
                        max=arr[l];
                        pIndex=l;
                    }
                }
            }
            i++;
            ans.add(max);
        }
        return ans;
    }
}