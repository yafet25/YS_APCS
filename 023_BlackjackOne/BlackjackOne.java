import java.util.Scanner;

public class BlackjackOne
{
    public static void main(String[]args)
    {
        int a1=(int)(Math.random()*11+1);
        int a2=(int)(Math.random()*11+1);
        int a3=(int)(Math.random()*11+1);
        int a4=(int)(Math.random()*11+1);
    
        boolean hitOrStay;
        // declare to go true or flase 
        int g;
        
        int foodA=(int)(Math.random()*11+1);
        
        int foodB=(int)(Math.random()*11+1);
        int cTotal= a1 + a2;

        int tc= (int)(Math.random()*11+1);
           
        int total= a1+a2+tc;
        //made a bunch of varibles for the program

        System.out.println("Your first card is" + a1);
        
        System.out.println("Your second card is" + a2);
        System.out.println("your total is"+ cTotal);
        Scanner scan= new Scanner(System.in);

        System.out.println("Do you want to hit or stay, if you want to hit type 1, if stay 0");
       
        g=scan.nextInt();
        //prints out down in the statament 

        if(g==1)
        {
            hitOrStay = true;
            
            System.out.println("Your third card is"+ tc );
            
            System.out.println(total);
            // if you want to hit this is your third card
        }
        else
        {
            System.out.println("you value is 0");
        }
        
        System.out.println("you have "+ total);
        System.out.println("the computer has"+cTotal);
        
        if(cTotal>21)
        {
            System.out.println("you busted");
        }
        //declares if you one or lost 
        
        
        else if (total<cTotal)
        {
            System.out.println(" dealer wins");
        }
        // if you lost thst dealer wins
        else
        {
            System.out.println("dealer loses");
            //if you on dealer lost
        }

        if(cTotal> total)
        {
            System.out.println("you lost");
        }
        else
        {
            System.out.println("you win");
        }
      //prints out the out come after hitting or staying

    }
}


    
    