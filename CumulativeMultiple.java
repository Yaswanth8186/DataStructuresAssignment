//Question 1: Cumulative Multiple of an Array with exception handling
//Description: Consider an Array with N number of integers.
	
//Sample input: arrNum = [5, 3, 4, 2, 0, 8]
//Output:- arrNum = [5, 15, 60, 120, 0, 0]

//java program

import java.util.*;
public class CumulativeMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraysize;
		int[] array;
		try {
			System.out.print("Enter the array size : ");
			arraysize = sc.nextInt();
			array = new int[arraysize];
			System.out.print("Enter the array elements : ");
			for(int i = 0;i < arraysize; i++)
				array[i] = sc.nextInt();
			for(int i = 1; i < arraysize;i++)
				array[i] = array[i - 1] * array[i];
			System.out.print("arrNum = [");
			for(int i = 0;i < arraysize; i++)
				if(i != arraysize - 1)
				 System.out.print(array[i] + ",");
				else
					System.out.print(array[i] + "]");
		}catch(Exception e) {
				System.out.println("Enter valid input");
		}
	}
}
