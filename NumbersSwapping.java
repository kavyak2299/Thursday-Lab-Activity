/*Author : Kavya K 
 Student Id : AF0232777
Date  : 03-11-2022(Thursday)
Aim : To swap two numbers with the help of third variable*/

package ThursdayActivity;

import java.util.Scanner;

public class NumbersSwapping {

	public static void main(String[] args) {
		
		
		//declared variables of type int
		int a , b , temp;
		
		//Scanner is a pre defined class which helps to take the input from the user
		Scanner sc = new Scanner(System.in);
		
		//This line is printing Enter the number String.
		System.out.println("Enter the first number");
		
		//here we are assigning what ever the user is inputing of sc of type nextInt to the variable a
		a=sc.nextInt();
		
		//This line is printing Enter the number String.
		System.out.println("Enter the second number");
		
		//here we are assigning what ever the user is inputing of sc of type nextInt to the variable b
		b=sc.nextInt();
		
		//We are closing the Scanner class
		sc.close();
		
		System.out.println("Number befor swapping a = " +a +" b = " +b );
		
		temp = a;  //a = 20 , temp = 20
		
		a=b; //b=40 , a=40
		
		b=temp; //temp =20 , b=20
		
		System.out.println("Number after swapping a = " +a +" b = " +b );

	}

}
