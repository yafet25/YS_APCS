import java.util.Scanner;
public class SimpleCounter
{
    public static void main(String[]args)
    {
        int foo=0;
        int bar;
        // made an integer  

        System.out.println("choose a number to count up to");
        Scanner scan = new Scanner(System.in);
       //scanner to ask what you want to count up to 
        bar= scan.nextInt();
        //prints it out 
        while(foo < bar)
        {
            foo++;
            // the incerments went up 
         System.out.print(foo + "  ");
         

        }
        
       
    }

}