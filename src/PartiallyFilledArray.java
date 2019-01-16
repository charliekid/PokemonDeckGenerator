
public class PartiallyFilledArray 
{
    private int maxNumberElements;
    private int [] a;
    private int numberUsed;
    
    /***************************************************************************
    * DESCRIPTION:    Default Constructor
    ****************************************************************************
    * PRECONDITIONS:  none
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    PartiallyFilledArray()
    {
        setMaxNumberElements(10);
        setIntArray();
        setNumberUsed(0);
    }
    /***************************************************************************
    * DESCRIPTION:    Full Constructor
    ****************************************************************************
    * PRECONDITIONS:  none
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    PartiallyFilledArray(int arraySize)
    {
        if (arraySize <= 0)
        {
            System.out.println("ERROR! Array size can't be 0 or negative.");
            System.exit(0);
        }
        setMaxNumberElements(arraySize);
        setIntArray();
        setNumberUsed(0);
    }
    /***************************************************************************
    * DESCRIPTION:    Copy Constructor
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    PartiallyFilledArray(PartiallyFilledArray orginal)
    {
        if (orginal == null)
        {
            System.out.println("Error! Aborting Program");
            System.exit(0);
        }
        
        setMaxNumberElements(orginal.maxNumberElements);
        setNumberUsed(orginal.numberUsed);
        setIntArray();

        for (int i = 0; i <this.numberUsed; i++)
        {
            a[i] = orginal.a[i];
        }
            
    }
    /***************************************************************************
    * DESCRIPTION:    Sets maxNumberElements.
    ****************************************************************************
    * PRECONDITIONS:  Parameters are met.
    ****************************************************************************
    * POSTCONDITIONS: Sets a new maxNumberElements
    ***************************************************************************/
    /***************************************************************************
    * DESCRIPTION:    Copy Constructor
    ****************************************************************************
    * PRECONDITIONS:  none
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    PartiallyFilledArray(int maxNumberElements, int numberUsed)
    {
        setMaxNumberElements(maxNumberElements);
        setIntArray();
        setNumberUsed(numberUsed);
    }
        /***************************************************************************
    * DESCRIPTION: Creates a string with int values
    ****************************************************************************
    * PRECONDITIONS:  Integer based array
    ****************************************************************************
    * POSTCONDITIONS: Retruns a string with in values.
    ***************************************************************************/
    public static String toStringArray(PartiallyFilledArray b)
    {
    	String result;
    	result = "{ ";

    	for(int i = 0; i < b.getNumberUsed(); i++)
    	{
                result += b.getElement(i);
    		
    		if(i < b.getNumberUsed()-1)
    		{
    			 result += ", ";
    		}
    		
    		if( (i+1) % 10 == 0)
    		{
    			result += " ";
    		}
    	}
    	result += " }";
    	
    	return result;
    }
    /***************************************************************************
    * DESCRIPTION:    Sets maxNumberElements.
    ****************************************************************************
    * PRECONDITIONS:  Parameters are met.
    ****************************************************************************
    * POSTCONDITIONS: Sets a new maxNumberElements
    ***************************************************************************/
    
    private void setMaxNumberElements(int i)
    {
        this.maxNumberElements = i;
    }
    /***************************************************************************
    * DESCRIPTION:    Sets int array.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    private void setIntArray()
    {
        this.a = new int [maxNumberElements];
    }
    /***************************************************************************
    * DESCRIPTION:    Sets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    private void setNumberUsed(int i)
    {
        this.numberUsed = i;
    }
    
    /***************************************************************************
    * DESCRIPTION:    Gets maxNumberElements.
    ****************************************************************************
    * PRECONDITIONS:  Parameters are met.
    ****************************************************************************
    * POSTCONDITIONS: Sets a new maxNumberElements
    ***************************************************************************/
    
    public int getMaxNumberElements()
    {
        return this.maxNumberElements;
    }

    /***************************************************************************
    * DESCRIPTION:    Gets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    public int getNumberUsed()
    {
        return this.numberUsed;
    }
    
    /***************************************************************************
    * DESCRIPTION:    Adds
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    public void add(int newElement)
    {
        if (getNumberUsed() >= a.length)
        {
            System.out.println("Error! Array already full.");
            System.exit(0);
        }
        else
        {
            a[getNumberUsed()] = newElement;
            this.numberUsed++;
        }
    }
    
    /***************************************************************************
    * DESCRIPTION:    Sets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    public int getElement (int index)
    {
        if (index < 0 || index >= getNumberUsed())
        {
            System.out.println("Error: Illegal or unused index!");
            System.exit(0);
        }
        return a[index];
    }
        /***************************************************************************
    * DESCRIPTION:    Sets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    public void resetElement (int index, int newValue)
    {
        if (index < 0 || index>= maxNumberElements)
        {
            System.out.println("Error! Illegal index.");
            System.exit(0);
        }
        else if (index > numberUsed)
        {
            Cs111.error("Error! Changing an index that is too large.");
        }
        else
            a[index] = newValue;
    }
        /***************************************************************************
    * DESCRIPTION:    Sets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    public void deleteLast ()
    {
        if (empty())
        {
            Cs111.error("Error! Deleting from an empty array!");
        }
        else
            numberUsed--;
    }
        /***************************************************************************
    * DESCRIPTION:    Sets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    
    public void delete(int index)
    {
        if (index < 0 || index>= getNumberUsed())
        {
            Cs111.error("Error! Unused Index");
        }
        for (int i = index; i < getNumberUsed(); i++)
        { 
            a[i] = a[i+1];
            numberUsed--;
        }
    }
        /***************************************************************************
    * DESCRIPTION:    Sets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    public boolean empty()
    {
        return(getNumberUsed() == 0);
    }
        /***************************************************************************
    * DESCRIPTION:    Sets numberUsed.
    ****************************************************************************
    * PRECONDITIONS:  
    ****************************************************************************
    * POSTCONDITIONS: 
    ***************************************************************************/
    public boolean full()
    {
        return (getNumberUsed() == getMaxNumberElements());
    }

}
