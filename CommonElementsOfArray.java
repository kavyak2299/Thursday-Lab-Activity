/*Author : Kavya K 
 Student Id : AF0232777
Date  : 10-11-2022(Thursday)
Aim : to find the common elements in an array*/

package ThursdayActivity;

import java.util.Arrays; 

public class CommonElementsOfArray {

	public static void main(String[] args) 
    {
      int[] firstArray = {11,24,22,10,24,35};
      int[] secondArray = {21, 10, 35,122, 20,11};
 
       System.out.println("Array1 : "+Arrays.toString(firstArray)); 
       System.out.println("Array2 : "+Arrays.toString(secondArray));
 
      
        for (int i = 0; i < firstArray.length; i++)
        {
            for (int j = 0; j < secondArray.length; j++)
            {
                if(firstArray[i] == (secondArray[j]))
                {
                 
                 System.out.println("Common element is : "+(firstArray[i]));
                 }
            }
        }
 
    }

}
