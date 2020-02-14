public class RefactorATableOfVariables
 //stated the class
{
    public static void main(String[] args)
    
    {
        int rowTwoCloumnOne=1; 
        int rowTwoCloumnTwo=rowTwoCloumnOne * rowTwoCloumnOne; 
        int rowTwoCloumnThree=rowTwoCloumnOne * rowTwoCloumnOne * rowTwoCloumnOne; 
        int rowThreeCloumnOne=2;
        int rowThreeCloumnTwo=rowThreeCloumnOne * rowThreeCloumnOne;
        int rowThreeCloumnThree=rowThreeCloumnOne * rowThreeCloumnOne * rowThreeCloumnOne;
        int rowFourCloumnOne=3; 
        int rowFourCloumnTwo=rowFourCloumnOne * rowFourCloumnOne; 
        int rowFourCloumnThree=rowFourCloumnOne * rowFourCloumnOne * rowFourCloumnOne;
        int rowFiveCloumnOne=4; 
        int rowFiveCloumnTwo=rowFiveCloumnOne * rowFiveCloumnOne; 
        int rowFiveCloumnThree=rowFiveCloumnOne * rowFiveCloumnOne * rowFiveCloumnOne;
        // made a variable for all the numbers then made them multiply to there self twice then again three times
        System.out.println(" a    a^2   a^3");
        System.out.println( rowTwoCloumnOne+  "      "+ rowTwoCloumnTwo+ "      "+ rowTwoCloumnThree);
        System.out.println( rowThreeCloumnOne+  "      "+ rowThreeCloumnTwo+ "      "+ rowThreeCloumnThree);
        System.out.println( rowFourCloumnOne+  "      "+ rowFourCloumnTwo+ "      "+ rowFourCloumnThree);
        System.out.println( rowFiveCloumnOne+  "      "+ rowFiveCloumnTwo+ "     "+ rowFiveCloumnThree);


       
        
        
        
        
     
        
        
    }
}