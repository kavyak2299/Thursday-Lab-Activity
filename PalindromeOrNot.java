/*Author : Kavya K 
 Student Id : AF0232777
Date  : 03-11-2022(Thursday)
Aim : To check whether the given number is palindrome or not*/

package ThursdayActivity;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
			    //declared variables of type int
				int num, remainder , reversedNum =0 ,temp;
				
				//Scanner is a pre defined class which helps to take the input from the user
				Scanner scObj = new Scanner(System.in);
				
				//This line is printing Enter the number String.
				System.out.println("Enter the number");
				
				//here we are assigning what ever the user is inputing of scObj of type nextInt to the variable num
				num = scObj.nextInt();
				
				//We are closing the Scanner class
				scObj.close();
				
				//we are assigning num variable data to temp variable
				temp=num;
				
				//while loop to check for the condition if the num is greater than 0
				while(num>0)
				{
					//what ever number remainder is there stored in a variable remainder
					remainder=num%10;  //num = 11 , 11%10 is 1 , 1 is stored in remainder
					
					//reversedNum is multiplied by 10 and added to the remainder
					reversedNum=(reversedNum*10)+remainder; //(0*10)+1 , reversedNumber = 1
					
					//num is divided by 10 and stored in num variable , num = 1
					num=num/10;
				}
				
				// checking whether temp == reversedNum
				
				if(temp==reversedNum)//1==1 , so it should be palindrome
					
						//We are saying enetred number is a palindrome number
						System.out.println(temp+ " is a palindrome number");
						
						//else  block
						else
							
						//here we are saying entered number is not a palindrome number
						System.out.println(temp+ " is not a palindrome number");
							
	}

}
