;/**
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

        // notice this methd (print) does not print a newline
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

        // generate a sciFi name
        
        int asdasd = (int) (Math.random() * 4);    
        System.out.println(firstName.substring(0,(int) (Math.random()*4)));
        //System.out.println(firstName.toUpperCase() );
        System.out.println(lastName.substring(0,(int) (Math.random()*2)));
        //System.out.println(lastName.toUpperCase() );
        System.out.println(city.substring(0,(int) (Math.random()*1)));
        //System.out.println(city.toLowerCase() );
        System.out.println(school.substring(0,(int) (Math.random()*3)));
        //System.out.println(school.toLowerCase() );
        System.out.println(relativeName1.substring(0,(int) (Math.random()*3)));
        //System.out.println(relativeName1.toUpperCase() );
        System.out.println(relativeName2.substring(0,(int) (Math.random()*3)));
        //System.out.println(relativeName2.toLowerCase() );
        
        System.out.println(firstName.substring(0,(int) (Math.random()*4)) + lastName.substring(0,(int) (Math.random()*2))
                                          + city.substring(0,(int) (Math.random()*1)) + school.substring(0,(int) (Math.random()*3))
                                          +relativeName1.substring(0,(int) (Math.random()*3)) + relativeName2.substring(0,(int)(Math.random()*3)));
          
                                                    
        
        
    }
}