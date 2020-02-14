public class YetAgainRefactorATableOfVariables
{
    public static void main(String[] args)
    {
        double rowTwoCloumnOne=1; 
        double rowTwoCloumnTwo= Math.pow(rowTwoCloumnOne,2); 
        double rowTwoCloumnThree= Math.pow(rowTwoCloumnOne,3); 
        
        double rowThreeCloumnOne=2;
        double rowThreeCloumnTwo= Math.pow(rowThreeCloumnOne,2);
        double rowThreeCloumnThree= Math.pow(rowThreeCloumnOne,3);
        
        double rowFourCloumnOne=3; 
        double rowFourCloumnTwo= Math.pow(rowFourCloumnOne,2); 
        double rowFourCloumnThree= Math.pow(rowFourCloumnOne,3);
        
        double rowFiveCloumnOne=4; 
        double rowFiveCloumnTwo= Math.pow(rowFiveCloumnOne,2); 
        double rowFiveCloumnThree= Math.pow(rowFiveCloumnOne,3);
        // made a variable for all the numbers then made them multiply to there self twice then again three times
        //multiped it to the power of how muchthere was
        
        System.out.println(" a    a^2   a^3");
        
        System.out.println( rowTwoCloumnOne+  "      "+ rowTwoCloumnTwo+ "      "+ rowTwoCloumnThree);
       
        System.out.println( rowThreeCloumnOne+  "      "+ rowThreeCloumnTwo+ "      "+ rowThreeCloumnThree);
        
        System.out.println( rowFourCloumnOne+  "      "+ rowFourCloumnTwo+ "      "+ rowFourCloumnThree);
        
        System.out.println( rowFiveCloumnOne+  "      "+ rowFiveCloumnTwo+ "     "+ rowFiveCloumnThree);
        // printed it out, with spaces so it would look like a table
    }

}