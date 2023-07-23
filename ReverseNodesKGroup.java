//Question 12: Reverse Nodes in k-Group
//Description: Solve the LeetCode Problem given as a link below

//LeetCode

//Example 1:
//Input: 
//head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]

//Example 2:
//Input: 
//head = [1,2,3,4,5], k = 3
//Output: [3,2,1,4,5]

//java program

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) 
            return head;
        ListNode end = head;
        int count = k;
        while(end != null && count > 1) {
            end = end.next;
            count--;
        }
        if(end == null) return head;
        ListNode temp = end.next, new1;
        end.next = null;
        new1 = reverse(head);
        head.next = reverseKGroup(temp, k);
        return new1;
    }
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null)
        return head;
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
