import java.util.Scanner;

public class RPSOne 
{
    public static void main(String[]args)
    {
        Scanner kingY=new Scanner(System.in);

        System.out.println("You bro Choose Rock,Paper, Scissor ");
        // mad e a scanner that tell you what choose
        String user = kingY.nextLine();
        int comt=(int)(3*Math.random())+1;
        String comp="";
        user= user.trim();
        //trims out unnessary

        if (comt==1){
                comp= "rock";
        }
        else if (comt==2){
                comp="paper";
        }
        else if (comt==3){
                comp="scissors";
        }
        //made a if stament telling you what the computer is going to generate

        if  (user.equals("rock") || user.equals("rock")) {
                System.out.println("You choose: Rock");
                user = "rock";
        }
        // made if statment to tell you what user promoting
        else if (user.equals("paper")||user.equals("paper")) {
                System.out.println("You choose: Paper");
                user = "paper";
        }
         // made if statment to tell you what user promoting
        else if (user.equals("scissor")||user.equals("scissor")) {
                System.out.println("You choos: scissors");
                user = "scissors";
        }
         // made if statment to tell you what user promoting
        else {
             System.out.println("invalid, defaulting to rock");
             user = "rock";
        }
         // made if statment to tell you what user promoting

        System.out.println("I choose: "+ comp);

        if (user.equals(comp)){
                System.out.println("A tie!");
        }
        else if (user.equals("rock")) {
                if (comp.equals("scissors"))
                        System.out.println("rock beats scissor - you win!");
                else if (comp.equals("paper"))
                        System.out.println("paper beats rock - you lose");
        }
        //made if statments to tell you the set of rules and when which one wins or loses 
        else if (user.equals("paper")) {
                if (comp.equals("scissors"))
                        System.out.println("scissors beats paper- you lose");
                else if (comp.equals("rock"))
                        System.out.println("Paper beats rock - you win");
        }
        //made if statments to tell you the set of rules and when which one wins or loses 
        else if (user.equals("scissors")) {
                if (comp.equals("paper"))
                        System.out.println("scissors beats paper - you win!");
                else if (comp.equals("rock"))
                        System.out.println("rock beats scissors - you lose!");
        }
        //made if statments to tell you the set of rules and when which one wins or loses 

 


            

    }
}
          
           
            