import java.util.Scanner;
public class BasicNestedPractice
{
    public static void main(String[] args) 
    {   int row = 0;
        
        int col= 0;
        
        String goat;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter the character");
        
        goat = scan.nextLine();

        int letter = goat.length();

        if (letter != 1)
        {
            System.out.println("print a charater");
        }

        else
        {
            System.out.println("how much rows you want");
            row = scan.nextInt();
           
            System.out.println(" how much cloums do you want");
            col= scan.nextInt();
        
        }
        
        
        for(int i = 0; i < row; i++) {
           
            for(int n=0; n < col ;n++){
               
                System.out.print(goat + " ");
           }
           
           System.out.println(); 
        }
    } 
}