import java.util.Scanner;
public class IsItLegalForYou
{
    public static void main(String[]args)
    {
     int age;
     
     //made a scanner for a stament that I wanted to say
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter your age and i'll tell you what allowed to do");
     age= scan.nextInt();
     

     if (age >= 16){
     System.out.println("you can get your driver license");
     }
     else {
     System.out.println("You're too young to get your license");
     }
     //made a if statment that tells you what age you can do or have stuff

    
     if (age>= 18){
     System.out.println("you can buy cigars go mess up your lungs");
     }
     else{
         System.out.println("YOUR NOT OLD ENOUGH to buy cigars SHAME ON YOU");
     }
     //made a if statment that tells you what age you can do or have stuff

    
     if (age>=18){
         System.out.println("Your aloud to make money at casino");
     }
     else{
         System.out.println("are you stupid your not old enough to go to a casino");

     }
     //made a if statment that tells you what age you can do or have stuff

     
     if(age>=21){
         System.out.println("you can DRINK BOOZE, go crazy");
     }
     else{
         System.out.println("ya your funny, you not even close to drinking alchol SHHAAAMMMMEEEEEEEEEEEEE");
     }
     //made a if statment that tells you what age you can do or have stuff
     
     if(age>=21){
         System.out.println("Go rent a car if you want");
     }
     else{
         System.out.println("no, no ,no your to young to rent a car grow up first");
     }
     //made a if statment that tells you what age you can do or have stuff
     
     

    }

}