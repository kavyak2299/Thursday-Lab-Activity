/*Author : Kavya K 
 Student Id : AF0232777
Date  : 24-11-2022(Thursday)
Aim : Demonstration of parent and child*/

package ThursdayActivity;

class parent
{
public void Parent()
{
System.out.println("This is a Parent class");
}
}
class child extends parent
{
public void Child()
{
System.out.println("This is a Child class");
}
}

public class ParentChild {

public static void main(String[] args) {
// TODO Auto-generated method stub
parent PP = new parent();
child CC = new child();
parent PC = new child();
System.out.println("We are Calling the Parent method using Parent Object");
PP.Parent();
System.out.println();
System.out.println(" We are Calling the Child method using Child Object");
CC.Child();
System.out.println();
System.out.println("We are  Calling the Parent method using Child Object");
PC.Parent();

}

}

