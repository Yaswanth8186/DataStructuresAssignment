//Question 11: Swap Nodes in Pairs
//Description: Solve the LeetCode Problem given as a link below

//LeetCode

//Example 1:
//Input: 
//head = [1,2,3,4]
//Output: [2,1,4,3]

//Example 2:
//Input: 
//head = []
//Output: []

//Example 3:
//Input: 
//head = [1]
//Output: [1]

//java program

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        else {
            ListNode temp = head;
             while(temp !=null && temp.next != null) {
                int t = temp.val;
                temp.val = temp.next.val;
                temp.next.val = t;
                temp = temp.next.next;
             }               
        }
        return head;
    }
}
