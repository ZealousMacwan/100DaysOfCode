// reverse-words-in-a-string
// https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;
        String temp = "";
        String reverse = "";
        while(left<=right){
            char c = s.charAt(left);
            if(c != ' '){
                temp += c;
            }else{
                if(!reverse.equals("")){
                    if(!temp.equals("")){
                        reverse = temp + " " + reverse;
                        temp = "";
                    }
                }else{
                    reverse = temp;
                    temp = "";
                }
            }
            left++;
        }
        if(!temp.equals("")){
            if(!reverse.equals("")){
                reverse = temp + " " +reverse;
            }else{
                reverse = temp;
            }
        }
        return reverse;
    }
}
