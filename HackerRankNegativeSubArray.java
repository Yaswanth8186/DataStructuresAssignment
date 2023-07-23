//Question 4: Java Subarray
//Description: Solve the HackerRank Problem given as a link below 

//Sample Input
//5
//1 -2 4 -5 1
  
//Sample Output
//9
  
//HackerRank Problem

//javaprogram

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, count = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n;i++)
        arr[i] = sc.nextInt();
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n - i;j++) {
                sum = 0;
                for(int k = j;k <=j+i;k++) {
                    sum += arr[k];
                }
                if(sum < 0)
                    count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
