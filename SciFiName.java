/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        //notice this method (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        
        //variable is initialized to the first three letters of users name
        String firstThreeFirst = firstName.substring(firstName.indexOf(firstName),3);
        // variable is initialized to the frst two letters of users last name
        String firstTwoLast = lastName.substring(lastName.indexOf(lastName), 2);
        // makes the new "sci-fi name" by concatenating the two previous variables
        String scifiFirst = (firstThreeFirst + firstTwoLast).toLowerCase();
        
        
        
        // next three lines creating the scifi last name
        String firstTwoCity = city.substring(city.indexOf(city), 2); 
        
        String firstTwoSchool = school.substring(school.indexOf(school), 3);
        
        String scifiLast = (firstTwoCity  + firstTwoSchool).toLowerCase();
        
        // creating the random number that is used for the boundaries in the method ".substring()"
        int randNum1 = (int)(Math.random() * relativeName1.length()) + 1;
        int randNum2 = (int)(Math.random() * relativeName2.length()) + 1;
        
        String randRelative1 = relativeName1.substring(randNum1, relativeName1.length());
      
        String randRelative2  = relativeName2.substring(randNum2, relativeName2.length());
        
        String scifiOrigin = randRelative1 + randRelative2;
        String capFirstOrigin = (scifiOrigin.substring(0,1)).toUpperCase();
        String capitalOrigin = capFirstOrigin + scifiOrigin.substring(1);
        
        
        System.out.println("Hello " + scifiFirst + " " + scifiLast + " of "  + capitalOrigin + ". Welcome!");
        
   
        
    }
}