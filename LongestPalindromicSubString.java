//Question 7: Longest Palindromic Substring
//Description: Solve the LeetCode Problem given as a link below

//LeetCode

//Example 1:
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

//Example 2:
//Input: s = "cbbd"
//Output: "bb"

//java program

class Solution {
    public String longestPalindrome(String s) {
        int begin = 0, lengt = 0, slength = s.length(), temp;
        if(slength <= 1)
            return s;
        for(int i = 0; i < slength;i++)  {
            temp = 1;
            while(i - temp >= 0 && i + temp < slength) {
                if(s.charAt(i - temp) == s.charAt(i + temp)) {
                    if(lengt < 2 * temp + 1) {
                        lengt = 2 * temp + 1;
                        begin = i - temp;
                    }
                }else{
                    break;
                }
                temp++;
            }
            temp = 1;
            while(i - temp + 1 >= 0 && i + temp < slength) {
                if(s.charAt(i - temp + 1) == s.charAt(i + temp)) {
                    if(lengt < 2 * temp) {
                        lengt = 2 * temp;
                        begin = i + 1 - temp;
                    }
                }else{
                    break;
                }
                temp++;
            }
        }
        if(lengt == 0)
            return s.substring(0,1);
        return s.substring(begin,begin+lengt);
    }
}
