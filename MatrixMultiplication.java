/*Author : Kavya K 
 Student Id : AF0232777
Date  : 10-11-2022(Thursday)
Aim : To multiply two matrices*/

package ThursdayActivity;

public class MatrixMultiplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,4,3},{0,2,3},{4,2,1}};
		//Two Dimensional array with 3 rows and 3 columns.
		int b[][]= {{2,2,5},{8,2,1},{5,2,1}};
		//Two Dimensional array with 3 rows and 3 columns.
		int c[][]= new int[3][3];
		//Another array to multiply the two arrays 'a' and 'b' and store it a c[][]
		
		for(int i=0;i<3;i++){
			
		for	(int j=0;j<3;j++)
		
		{
				
			c[i][j]=0;  
			
			for(int k=0;k<3;k++) 
				
			{      
				c[i][j]+=a[i][k]*b[k][j]; //Where the multiplication of 2 matrices is happening
		
			}
			 
			System.out.print(c[i][j]+" ");  //printing matrix element  
		} 
		  System.out.println();//We want the matrix format so to print in next line this is used.    
	}    
	}

}

