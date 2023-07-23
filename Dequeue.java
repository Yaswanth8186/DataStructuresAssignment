//Question 9: Java Dequeue
//Description: Solve the HackerRank Problem given as a link below

//HackerRank

//Sample Input
//6 3
//5 3 5 2 3 2

// Sample Output
// 3

//java program

import java.util.*;
public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt(), k = 0,max = 0;
        int m = in.nextInt();
        int[] arr = new int[n];
        Set<Integer>h = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[k++] = num;
            deque.add(num);
            h.add(num);
            if(deque.size() == m) {
                if(h.size() > max) 
                    max = h.size();
                int element = (int)deque.remove();
                if(!deque.contains(element))
                    h.remove(element);
            }
        }
        System.out.println(max);
        in.close();        
    }
}
