/*Author : Kavya K 
 Student Id : AF0232777
Date  : 17-11-2022(Thursday)
Aim : Peter wants to implement exception handling such that if a user enters a menu input other
than 1,2 and 3 in the game menu option , an appropriate user defined exception should be generated.
In addition a user defined exception should be generated if the player inputs multiple characters,instead
of a single character to identify the possible alphabet in the word*/

package ThursdayActivity;

import java.util.*;
public class GamePlayerInputs
{
    public static void validate(int n)throws Exception
    {
        if(n!=1 && n!=2 && n!=3)
        {
            throw new Exception("");
        }
        else{
            System.out.println("Start the Game");
        }
    }
   public static void validateLength( String n)throws Exception
   {
       
      
       
       if(n.length()>1)
       {
           throw new Exception("");
       }
   }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String c=sc.next();
		
		try{
		    validateLength(c);
		
		
		}
		catch(Exception e)
		{
		    System.out.println("Length should be of single letter");
		}
		 try
		 {
		     validate(n);
		 }
		 catch(Exception e)
		 {
		     System.out.println("The Input should not be other than 1 , 2 , 3");
		 }
		finally{
		    System.out.println("End of the program");
		}
		 
		 sc.close();
		
	}
}
