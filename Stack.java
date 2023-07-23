//Question 8: Java Stack
//Description: Solve the HackerRank Problem given as a link below

//HackerRank

//Sample Input
//{}()
//({()})
//{}(
//[]

//Sample Output
//true
//true
//false
//true

//java program

import java.util.*;
class Solution{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
            int flag = 0;
			String input=sc.next();
            Stack<Character>s = new Stack<Character>();
            for(int i = 0; i < input.length();i++) {
                if(input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
                    s.push(input.charAt(i));
                }else {
                    if(s.isEmpty()) {
                        flag = 1;
                        System.out.println("false");
                        break;
                    }else{
                        char pop = s.pop();
                        if(input.charAt(i) == '}' && pop != '{') {
                            flag = 1;
                            System.out.println("false");
                            break;
                        }else if(input.charAt(i) == ']' && pop != '[') {
                            flag = 1;
                            System.out.println("false");
                            break;
                        }else if(input.charAt(i) == ')' && pop != '(') {
                            flag = 1;
                            System.out.println("false");
                            break;
                        }
                    }
                }
            }
            if(flag == 0)
                if(s.isEmpty() )
                    System.out.println("true");
                else 
                    System.out.println("false");
		}	
    sc.close();	
	}
}
