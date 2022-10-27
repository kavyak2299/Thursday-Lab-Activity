/*Author : Kavya K 
 Student Id : AF0232777
Date  : 27-10-2022(Thursday)
Aim : to add 8 to the number 2345 & then divide it by 3 , modulus of the quotient is taken with 5 
       & multiply the resultant value by 5 */

package OperatorsLogicProgram;

public class OperatorsLogic {

	public static void main(String[] args) {
		
		int num = 2345;
		float result;
		//number 2345+8 = 2353 , 2353/3 = 784 , 784 % 5 = 4 , 4*5 = 20 ,therefore result is 20
		result = (((num+8)/3)%5)*5; 
		System.out.println(result);

	}

}
