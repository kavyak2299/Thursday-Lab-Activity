/*Author : Kavya K 
 Student Id : AF0232777
Date  : 27-10-2022(Thursday)
Aim : To accept password and confirm password from the user , print Success if matches else print error*/

package StringComparison;

import java.util.Scanner;

public class StringComparisonExample {

	public static void main(String[] args) {
		
		String str1 , str2;
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter your password ");
		str1=scObj.next();
		System.out.println("Confirm your password ");
		str2=scObj.next();
		scObj.close();
		if(str1.equals(str2)) //equals is the method used to compare the two strings
			System.out.println("Success");
		else
			System.out.println("Error");
		

	}

}
