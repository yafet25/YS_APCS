public class ComputeAnExpressionTwo
{
    public static void main(String[]args)
    {
       ReturningCalculator calc= new ReturningCalculator();
       
       double theA =calc.doubleMultiplier(9.5,4.5);
       
       double theB= calc.doubleMultiplier(2.5,3);
       
       double theC= calc.doubleSubtractor(45.5,3.5);
       // made a variable and showed what to multply and subtract
       double theD= calc.divider((theA+theB),theC);
       
       System.out.println(theD);
       //made the variable subtract theB and divide theC
    }

}
// defined the class
   