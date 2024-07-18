// remove-outermost-parentheses
// https://leetcode.com/problems/remove-outermost-parentheses/
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
                if(open > 1){
                    stringBuilder.append(c);
                }
            }else{
                open--;
                if(open > 0){
                    stringBuilder.append(c);
                }
            }
        }
        return stringBuilder.toString();
    }
}