// find-missing-and-repeating2512
// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
class Solve {
    int[] findTwoElement(int arr[], int n) {
        long nVal = (arr.length);
        long Sn = (nVal * (nVal + 1))/2;
        long S2n = (nVal * (nVal + 1) * (2 * nVal + 1))/6;
        
        long Sc = 0;
        long S2c = 0;
        for(int i=0; i<nVal; i++){
            Sc += arr[i];
            S2c +=  (long)arr[i] * (long)arr[i];
        }
        
        // eq 1:  x - y = Sc - Sn
        long value1 = Sc- Sn;
        
        //e1 2: x2 - y2 = S2c - S2n 
        long value2 = S2c - S2n;
        
        // (x-y)(x+y) = S2c - S2n
        // (x+y) = (S2c - S2n)/(x-y)
        // (x+y) = (S2c - S2n)/(Sc- Sn)
        // (x+y) = (S2c - S2n)/value1
        // (x+y) = (value2) / value1
        // now value2 is nothing but x + y
        value2 = value2 / value1;
        
        // x = ((x+y)+(x-y))/2
        // y = x - (x-y)
        
        long x = (value1 + value2)/2;
        long y = x - value1;
        
        int ans[] = {(int)x, (int)y};
        
        return ans;
    }
}