//Question 2: Find missing numbers in array
//Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

//Sample input: arrNum = {1, 2, 4, 5, 6}
//Output: 3

//Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}
//Output: 4, 7, 9, 12, 13

//java program

import java.util.*;
public class MissingNumber {
	public int[] readElements(int arraysize) {
		int[] array = new int[arraysize];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array elements : ");
		for(int i = 0;i < arraysize;i++) 
			array[i] = sc.nextInt();		
		return array;
	}
	public void findMissing(int[] array) {
		int[] array2 = new int[100];
		int k = 0;
		for(int i = 0; i < array.length - 1;i++) {
			if(array[i] + 1 == array[i + 1]) 
				continue;
			else {
				int difference = array[i + 1] - array[i];
				for(int j = 0; j < difference - 1;j++)
				array2[k++] = array[i] + 1 + j;
			}
		}
		System.out.print("The missing numbers are : ");
		for(int i = 0; i < k;i++) 
			System.out.print(array2[i] + " ");
	}
	public static void main(String[] args) {
		int arraysize;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		arraysize = sc.nextInt();
		MissingNumber num = new MissingNumber();
		int[] array = num.readElements(arraysize);
		num.findMissing(array);
	}
}
