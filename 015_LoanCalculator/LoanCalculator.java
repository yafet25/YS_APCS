import java.util.Scanner;
//made a scanner

public class LoanCalculator 
{
    public static void main(String[] args) 
    {
      Double monthsLoan;


      Double principal;

      
      Double annualInterest;
      
    
      //mad doubles for all the variales
      

    Scanner scan= new Scanner(System.in);
    
    System.out.println("whats the principal balance");
    principal= scan.nextDouble();
   
    System.out.println("whats the annaulInterest");
    annualInterest= scan.nextDouble();
    
    System.out.println("whats the remaining months on loan");
    
    monthsLoan=scan.nextDouble();

    double mI=  principal * (annualInterest/ monthsLoan);
    System.out.println("your monthly interst is "+ mI);

    double mP= principal/monthsLoan + mI;
    System.out.println("you monthly payment is " + mP );
    // monthlyPayment 
    //asked quetion and answerd acordingly
  }
}