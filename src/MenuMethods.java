/**************************************
* AUTHOR:           Charlie Nguyen
* COURSE:           CS 111
* SECTION:          TuTh 12pm-4
* LAST MODIFIED:    8/5/15
**************************************/
import java.util.StringTokenizer;

public class MenuMethods
{
    final String NAME = "Charlie Nguyen";
    final String COURSE = "CS 111 Intro to CS I";
    final String SECTION = "TuTh 12pm-4pm";

    private String list;
    private int itemCount; 
	
    
    /**
    * DESCRIPTION:          Creates a menu with 3 items.  	
    *
    * <p>(PRE-CONDITIONS:   All parameters are met.)
    * <p>(POST-CONDITIONS:  Prints on string a menu for user.)
    * @param prompt         Prints as a header for the menu.
    * @param optionA        Menu item #1's option.
    * @param optionB        Menu item #2's option.
    * @param optionC        Menu item #3's option.
    * @param optionX        Menu's exit or back option. 
    */
    public static void menu(String prompt, String optionA, 
	                String optionB, String optionC, String optionX)
    {
        //DECLARE//
        System.out.println(prompt);
        System.out.println("A : " + optionA);
        System.out.println("B : " + optionB);
        System.out.println("C : " + optionC);
        System.out.println("X : " + optionX);
        System.out.println();
    }
    /**
    * DESCRIPTION:          Creates a menu	
    * <p>(PRE-CONDITIONS:   String list A menu description list separated by
    *                       commas)
    * <p>(POST-CONDITIONS:  Prints out a menu with alpha hot key options.)
    * @param prompt         This could be a title or a direction to tell the 
    *                       user what to do with the menu.
    * @param list           This contains a list of menu item separated by commas.
    */
    public static void menu(String prompt, String list)
    {
        //DECLARE//
        MenuMethods menu;
        menu = new MenuMethods();

        menu.setList(list);
        menu.setItemCount(menu.numOfMenuItems(list));

        String [] words;
        words = new String [menu.getItemCount()];
        menu.makeVariables(words);
        System.out.println(prompt);
        System.out.println(menu.toStringArray(words));

    }
    /**
    * DESCRIPTION:          Creates a menu that is formatted.
    * <p>(PRE-CONDITIONS:   String list is separated by commas.)
    * <p>(POST-CONDITIONS:  Prints a formatted menu with alpha hot keys.)
    * @param prompt         This could be a title or a direction to tell the 
    *                       user what to do with the menu.
    * @param list           String list A menu description list separated by
    *                       commas.
    */
    
    public static void visualMenu(String prompt, String list)
    {
        MenuMethods menu;
        menu = new MenuMethods();

        menu.setList(list);
        menu.setItemCount(menu.numOfMenuItems(list));

        String [] words;
        words = new String [menu.getItemCount()];
        menu.makeVariables(words);
        System.out.println("--------------------------------------------");
        System.out.printf("|%5s%-37s|%n", "", prompt);
        System.out.printf("|%42s|%n", "");
        for (int i= 0; i< words.length ; i++)
        {
            String result;
            int alphaStart;
            alphaStart = 65 + i; //A on ascii chart
            result = (char)alphaStart + ": " + words[i];
            System.out.printf("|%5s%-37s|%n", "", result);
        }
        System.out.printf("|%42s|%n", "");
        System.out.println("--------------------------------------------");
    }
    
    /**
    * DESCRIPTION:          Counts the number of items for the menu options.
    * <p>(PRE-CONDITIONS:   String list A menu description list separated by
    *                       commas.
    * <p>(POST-CONDITIONS:  Returns int of how many items are in list.)
    * @param list           String list A menu description list separated by
    *                       commas. 
    */
    public static int numOfMenuItems(String list)
    {
        int result;

        StringTokenizer menuListString;
        menuListString = new StringTokenizer(list, ",");

        result = menuListString.countTokens();
        return result;	
    }
    /**
    * DESCRIPTION:          Sets instance variable itemCount 
    * (PRE-CONDITIONS:      All parameters are met)
    * (POST-CONDITIONS:     Sets the instance variable to parameters.)
    * @param itemCount      This is the number of menu items/options you want.
    */
    public void setItemCount(int itemCount)
    {
        this.itemCount = itemCount;
    }
    /**
    * DESCRIPTION:          Set instance variable list
    * <p>PRE-CONDITIONS:    All parameters are met
    * <p>POST-CONDITIONS:   Sets the instance variable to parameters.
    * @param list           String list A menu options list separated by
    *                       commas.      
    */
    public void setList(String list)
    {
        this.list = list;
    }
    /**
    * DESCRIPTION:          Returns itemCount instance variable.
    * <p>PRE-CONDITIONS:    None
    * <p>POST-CONDITIONS:   Returns itemCount instance variable.
    */
    public int getItemCount()
    {
        return this.itemCount;
    }
    /**
    * DESCRIPTION:          Returns list instance variable.
    * (PRE-CONDITIONS:       none)
    * (POST-CONDITIONS:      Returns list instance variable.)
    */
    public String getList()
    {
        return this.list;
    }
    /**
    * DESCRIPTION:          Creates an array of string of menu option.
    * (PRE-CONDITIONS:       All parameters are met.)
    * (POST-CONDITIONS:      Creates a variable for each menu option.)
    * @param array          This array contains menu options. 
    */

    public void makeVariables(String[] array)
    {
        StringTokenizer a;
        a = new StringTokenizer(this.list, ",");
        int i;

        for (i = 0; i <array.length; i++)
        {
            array[i] = a.nextToken();
        }

    }
    /**
    * DESCRIPTION: Creates a string with int values
    * (PRECONDITIONS:  Integer based array)
    * (POSTCONDITIONS: returns a string with in values.)
    * @para
    */
    public static String toStringArray(String[] b)
    {
        String result; //A is at 65
        int start;
        start = 65;
        result = "|";

        for(int i = 0; i < b.length; i++)
        {
                result += (char)start + ": " + b[i]; 
                start++;
                if(i < b.length-1)
                {
                         result += "|";
                }

                if( (i+1) % 1 == 0)
                {
                        result += "\n";
                }
        }
        result += " ";

        return result;
    }

}