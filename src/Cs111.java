/**************************************
 * AUTHOR:           Charlie Nguyen
 * COURSE:           CS 111
 * SECTION:          TuTh 12pm-4
 * HOMEWORK #:       
 * LAST MODIFIED:    7/14/15 8:35am
 **************************************/



import java.util.Random;
import java.util.Scanner;

public class Cs111
{
	final static String NAME = "Charlie Nguyen";
	final static String COURSE = "CS 111 Intro to CS I";
	final static String SECTION = "TuTh 12pm-4pm";
	final static int NUM_BREAK = 10;

    /***************************************************************************
    * DESCRIPTION:      Print author information for start of program
    ****************************************************************************
    * PRE-CONDITIONS:	All parameters are given a value
    ****************************************************************************
    * POST-CONDITIONS:	Outputs author info to console
    ***************************************************************************/
	public static void printHeader(int homework, String lastModified) 
	{
            System.out.println("/********************************************");
            System.out.println("* AUTHOR:        " + NAME);
            System.out.println("* COURSE:        " + COURSE);
            System.out.println("* SECTION:       " + SECTION);
            System.out.println("* HOMEWORK #:    " + homework);
            System.out.println("* LAST MODIFIED: " + lastModified);
            System.out.println("********************************************/");
	}
    /*************************************************************************
    * DESCRIPTION:    reads input from user, returns integer value 
    *                 (error-checked using bounds)
    **************************************************************************
    * PRECONDITIONS:  key is instantiated, 
    *                 prompt is in form "Enter...: ", lower  upper
    ***************************************************************************
    * POSTCONDITIONS: returns integer value between lower and upper (inclusive)
    **************************************************************************/
    public static int readInt(String prompt, int lower, int upper)
    {
        Scanner key;
        String temp;
        int result;
        boolean isNotValid;
        
        key = new Scanner(System.in);
        
        do
        {
            System.out.print(prompt);
            temp = key.nextLine();
            result = Integer.parseInt(temp);
            isNotValid = (result < lower) || (result > upper);
            if(isNotValid)
            {
                System.out.println("ERROR: please enter value between " 
                          + lower + " - " + upper);
            }
        } while(isNotValid);
        
        return result;
    }
    
    /*************************************************************************
    * DESCRIPTION:    reads input from user, returns double value 
    *                 (error-checked using bounds)
    ***************************************************************************
    * PRECONDITIONS:  Assuming number input is between upper and lower,
    *                  scanner is instantiated
    ***************************************************************************
    * POSTCONDITIONS: returns a value that is between uppper and lower
    **************************************************************************/
    public static double readDouble(String prompt, Scanner keyboard, 
                                         double lower, double upper)
    {
        String temp;
        double result;
        boolean isNotValid;
   
        do
        {
            System.out.print(prompt);
            temp = keyboard.nextLine();
            result = Double.parseDouble(temp);
            isNotValid = (result < lower) || (result > upper);
            if(isNotValid)
            {
                System.out.println("ERROR: please enter value between " 
                                + lower + " - " + upper);
            }
        }  while(isNotValid);
        
        return result; 
    }
    /************************************************************************
    * DESCRIPTION:    reads input from user, returns char value 
    *                 (error-checked using validChars)
    ***************************************************************************
    * PRECONDITIONS:  Assume input is only one character, scanner is initialized
    ***************************************************************************
    * POSTCONDITIONS: returns if the char exists in the string or not
    **************************************************************************/
    public static char readChar(String prompt, String validChars)
    {
        Scanner keyboard;
        String temp;
        char result;
        boolean isNotValid;
        
        keyboard = new Scanner (System.in);
        
        do
        {
            System.out.print(prompt);
            temp = keyboard.nextLine();
            result = temp.charAt(0);
            isNotValid = (validChars.indexOf(result) == -1);
            
            if(isNotValid)
            {
                System.out.println("ERROR: please enter in \""+validChars+"\"");
            }
        }  while(isNotValid);
        
        return result; 
    }
    /***************************************************************************
    * DESCRIPTION:  toString Array for a boolean   
    ****************************************************************************
    * PRECONDITIONS:  Parameters are met with a boolean array
    ****************************************************************************
    * POSTCONDITIONS: Returns array values.
    ***************************************************************************/
    
    public static String toStringArray(boolean[] b)
    {
    	String result;
    	result = "{ ";

    	for(int i = 0; i < b.length; i++)
    	{
    		result += b[i];
    		
    		if(i < b.length-1)
    		{
    			 result += ", ";
    		}
    		
    		if( (i+1) % NUM_BREAK == 0)
    		{
    			result += "\n\t";
    		}
    	}
    	result += " }";
    	
    	return result;
    }
    /***************************************************************************
    * DESCRIPTION:  Creates a string with a double variable values
    ****************************************************************************
    * PRECONDITIONS:  double type array
    ****************************************************************************
    * POSTCONDITIONS: Returns string with double variable values.
    ***************************************************************************/
    
    public static String toStringArray(double[] b)
    {
    	String result;
    	result = "{ ";

    	for(int i = 0; i < b.length; i++)
    	{
    		result += b[i];
    		
    		if(i < b.length-1)
    		{
    			 result += ", ";
    		}
    		
    		if( (i+1) % NUM_BREAK == 0)
    		{
    			result += "\n\t";
    		}
    	}
    	result += " }";
    	
    	return result;
    }
    /***************************************************************************
    * DESCRIPTION: Creates a string with int values
    ****************************************************************************
    * PRECONDITIONS:  Integer based array
    ****************************************************************************
    * POSTCONDITIONS: Retruns a string with in values.
    ***************************************************************************/
    public static String toStringArray(int[] b)
    {
    	String result;
    	result = "{ ";

    	for(int i = 0; i < b.length; i++)
    	{
    		result += b[i];
    		
    		if(i < b.length-1)
    		{
    			 result += ", ";
    		}
    		
    		if( (i+1) % NUM_BREAK == 0)
    		{
    			result += " ";
    		}
    	}
    	result += " }";
    	
    	return result;
    }
    /***************************************************************************
    * DESCRIPTION: Creates a string with int values
    ****************************************************************************
    * PRECONDITIONS:  Integer based array
    ****************************************************************************
    * POSTCONDITIONS: Returns a string with in values.
    ***************************************************************************/
    public static String toStringArray(char[] b)
    {
    	String result;
    	result = "{ ";

    	for(int i = 0; i < b.length; i++)
    	{
    		result += b[i];
    		
    		if(i < b.length-1)
    		{
    			 result += ", ";
    		}
    		
    		if( (i+1) % NUM_BREAK == 0)
    		{
    			result += "\n\t";
    		}
    	}
    	result += " }";
    	
    	return result;
    }
    /***************************************************************************
    * DESCRIPTION: Creates a string with int values
    ****************************************************************************
    * PRECONDITIONS:  Integer based array
    ****************************************************************************
    * POSTCONDITIONS: Returns a string with in values.
    ***************************************************************************/
    public static String toStringArray(char[] a, int[] b)
    {
    	String result;
    	result = "Letter Count: \n";

    	for(int i = 0; i < a.length; i++)
    	{
                result += a[i] + ": " + b[i];
    		
    		if(i < a.length-1)
    		{
    			 result += "\t";
    		}
    		
    		if( (i+1) % NUM_BREAK == 0)
    		{
    			result += "\n\t";
    		}
    	}
    	result += " }";
    	
    	return result;
    }

    /***************************************************************************
    * DESCRIPTION:    Copy char array to an int array
    ****************************************************************************
    * PRECONDITIONS:  char Array
    ****************************************************************************
    * POSTCONDITIONS: Creates a copy of an array.
    ***************************************************************************/
    public static int[] copyArray(char[] original)
    {
    	int[] copy;
    	
    	copy = new int [original.length];
    	
    	for(int i = 0; i < copy.length; i++)
    	{
    		copy[i] = original[i]; 
    		//for object arrays, make sure to deep copy w/ copy constructor!!!
    	}
    	
    	return copy;
    }
    /***************************************************************************
    * DESCRIPTION:      Fills a char array with a string.
    ****************************************************************************
    * PRECONDITIONS:    Parameters are met.
    ****************************************************************************
    * POSTCONDITIONS:   Assigns a char value to each array element.
    ***************************************************************************/
    public static void makeVariables(char[] array, String userInput)
    {
        int i;
        
        for (i = 0; i <array.length; i++)
            {
                array[i] = userInput.charAt(i);
            }
    }

    /***************************************************************************
    * DESCRIPTION:      Fills an array int with random numbers
    ****************************************************************************
    * PRECONDITIONS:    Parameters are met.
    ****************************************************************************
    * POSTCONDITIONS:   Assigns a value to each array element with a random 
    *                   number.
    ***************************************************************************/
    public static void fillArrayRandom(int[] array)
    {
        int i;
        Random randomGenerator;
        randomGenerator = new Random();
        
        
        for (i = 0; i <array.length; i++)
            {
                array[i] = randomGenerator.nextInt(1000);
            }
    }
    
    /***************************************************************************
    * DESCRIPTION:      Prints an error and exit.
    ****************************************************************************
    * PRECONDITIONS:    Parameters are met.
    ****************************************************************************
    * POSTCONDITIONS:   Prints an error message to the user and exits program.
    ***************************************************************************/
    public static void error(String errorLine)
    {
        System.out.println(errorLine);
        System.exit(0);
    }
}
    
    
