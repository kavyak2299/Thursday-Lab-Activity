/*Author : Kavya K 
 Student Id : AF0232777
Date  : 10-11-2022(Thursday)
Aim :to get car name and  Car model and print as constant */

package ThursdayActivity;

public class CarModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum car{maruthi(2019),tesla(2020),innova(2014);
		private int value;  
		private car(int value){  
		this.value=value;  
		}  
		}
		System.out.println("    Car Name\tModel Year");
		for(car c : car.values())
			System.out.println("    "+c+"\t"+c.value);
	}
}


			

		