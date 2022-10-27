/*Author : Kavya K 
 Student Id : AF0232777
Date  : 27-10-2022(Thursday)
Aim : Even or Odd Program */

package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		int num;
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = scObj.nextInt();
		scObj.close();
		if(num%2==0)
			System.out.println(+num +" is an even number");
		else
			System.out.println(+num +" is an odd number");
			
	}

}
