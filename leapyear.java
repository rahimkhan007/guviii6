import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int year = 2015;
 
        //Flag to store the test result
        boolean isLeapYear = false;
 
        if(year % 400 == 0)
        {
            isLeapYear = true;
        }
        else if (year % 100 == 0)
        {
            isLeapYear = false;
        }
        else if(year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }
 
        //Output the test result
        if(isLeapYear)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
 
	}
}
