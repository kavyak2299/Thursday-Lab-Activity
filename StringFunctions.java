/*Author : Kavya K 
 Student Id : AF0232777
Date  : 17-11-2022(Thursday)
Aim : 5 functions of string*/

package ThursdayActivity;

public class StringFunctions {

	    public static void main(String[] args) {

	        String name="Kavya Kamraj";
	        int value= name.length();
	        System.out.println(value);

	        String lstring = name.toLowerCase();
	        System.out.println(lstring);

	        String ustring= name.toUpperCase();
	        System.out.println(ustring);

	        String nontrimstring="     kavyaa     ";
	        System.out.println(nontrimstring);

	        String trimedstring=nontrimstring.trim();
	        System.out.println(trimedstring);


	        System.out.println(name.substring(1,4));
	        System.out.println(name.replace("a","y"));


	    }

	}

