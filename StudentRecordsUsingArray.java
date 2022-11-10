/*Author : Kavya K 
 Student Id : AF0232777
Date  : 10-11-2022(Thursday)
Aim : To create students records using array*/

package ThursdayActivity;

public class StudentRecordsUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//intialising rollNo , here the array size is 5
	int rollNo[]= {101,102,103,104,105};
	//intialising name , here the array size is 5
	String name[] = {"Gayathri","Asha","Madan","Chandan","Karthik"};
	//intialising address , here the array size is 5
	String address[] = {"Bangalore","Kolar","Salem","Gulbarga","Mandya"};
	System.out.println("The List of Student Records");
	//for loop to loop over the array elements
	for(int i=0;i<5;i++)
		{
			//to print the array elements 
			System.out.println("The id " +rollNo[i]+" is "+name[i] + " from " +address[i]);
		}
	}

}
