/*Author : Kavya K 
 Student Id : AF0232777
Date  : 03-11-2022(Thursday)
Aim : To check whether the entered number is prime or not */

package ThursdayActivity;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		//num  is a variable of type int
		int num;
		
		//flag is a variable of type boolean which is set to false
		boolean flag = false;
		
		//Scanner is a pre defined class which helps to take the input from the user
		Scanner sc = new Scanner(System.in);
		
		//This line is printing Enter the number String.
		System.out.println("Enter the number");
		
		//here we are assigning what ever the user is inputing sc object of type nextInt to the variable num
		num = sc.nextInt();
		
		//We are closing the Scanner class
		sc.close();
		
		//for is a loop used to loop from i=2 to i<=num/2 and then incrementing the i value
		for(int i=2;i<=num/2;i++)
		{
			//if the number is divisible by i'th number 
			if(num%i==0)
			{
				//then the flag is set to true
				flag=true;
				
				//breaking the loop here
				break;
			}
			
		}
		
		//if the number is not divisible by any other number then the flag is set to false , !(not) is a symbol used to check
		if(!flag)
			
		//We are saying enetered number is a prime number
		System.out.println(num+ " is a prime number");
		
		//else  block
		else
			
		//here we are saying entered number is not a prime number
		System.out.println(num+ " is not a prime number");
			
		

	}

}
