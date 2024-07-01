// https://www.geeksforgeeks.org/problems/minimum-sum4058/1
// minimum-sum4058

//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            String ans = new Solution().solve(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java





class Solution {
    String solve(int[] arr, int n) {
        
        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder();
        int i = n-1;
        int j = n-2;
        int carry = 0;
        
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0)
                sum += arr[i];
            if(j>=0)
                sum += arr[j];
            carry = sum / 10;
            if(sum > 0)
                ans.append(sum%10);
            i -= 2;
            j -= 2;
        }
        if(carry > 0)
            ans.append('1');
        
        ans.reverse();
            
        //first index zero remove it
        //while(ans.length() > 1 && ans.charAt(0) == '0')
        //    ans.deleteCharAt(0);
        
        return ans.length() == 0 ? "0" : ans.toString();
  
    }
}
