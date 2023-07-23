//Question 3: Find the count of singulars in array
//Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

//Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}
//Output: Count of singular socks = 3

//java program  

import java.util.*;
public class SingularCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberofsockpairids, singularsocks = 0;;
		System.out.print("Enter the number of sock pair ID's : ");
		numberofsockpairids = sc.nextInt();
		int[] sockPair = new int[numberofsockpairids];
		System.out.print("Enter the sock pair ID's : ");
		for(int i = 0;i < numberofsockpairids; i++) 
			sockPair[i] = sc.nextInt();
		Arrays.sort(sockPair);
		for(int i = 0, count = 0; i < sockPair.length - 1; i++) {
			if(sockPair[i] == sockPair[i + 1]) {
				count++;
			}else {
				if((count + 1)% 2 == 1)
					singularsocks++;
				count = 0;
			}
			if(i == sockPair.length - 2)
				if(count % 2 == 0 && count > 0)
					singularsocks++;
		}
		if(((sockPair.length > 1) && sockPair[sockPair.length - 1] != sockPair[sockPair.length-2]) || sockPair.length == 1)
			singularsocks++;
		System.out.println("Total number of singular socks = " + singularsocks);
	}
}
