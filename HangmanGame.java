/*Author : Kavya K 
 Student Id : AF0232777
Date  : 17-11-2022(Thursday)
Aim : Hangman Game*/

package ThursdayActivity;

import java.util.*;

public class HangmanGame{
	
    public static boolean isExist(String str,char c)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            return true;
        }
        return false;
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int nameLength=0,blank=0,totalLength=0;
		for(int i=0;i<str.length();i++)
		{
		    int c=str.charAt(i);
		    if(Character.isLetter(c))
		    {
		        nameLength++;
		        totalLength++;
		    }
		    else if(!Character.isLetter(c))
		    {
		        blank++;
		        totalLength++;
		    }
		}
		System.out.println("NAME LENGTH"+"="+nameLength+" "+"DASH LENGTH"+"="+blank+" "+"TOTAL LENGTH"+"="+totalLength);
		char c=sc.next().charAt(0);
	    if(isExist(str,c)==true)
	    {
	        System.out.println("Yes the Character "+c+" Exist in the Word");
	    }
	    else{
	        System.out.println("No the Character "+c+" doest not exist in the word");
	    }
	    
	    sc.close();
		
		 
	}
}

