public class PopulationProjection

{
    public static void main(String[] args){
    int totalA= 312032486;
    int theDayOfTheYear=365;
    int theHoursOfDay=24;
    int theSecsOfTheHour=3600;
    int theSecsOfTheYear= theDayOfTheYear + theHoursOfDay +theSecsOfTheHour;
    //made a variables for all the time used in the program
    int theBirth= theSecsOfTheYear/7;
    int theDeath= theSecsOfTheYear/-13;
    int theImmi= theSecsOfTheYear/45;
    int totalB=  theBirth + theDeath + theImmi;
    // variables of bith and -death and ammount of immigrants that come in the U.S
    System.out.println("the original totalA"+ totalA);
    System.out.println("1st year   "+ (totalA + totalB));
    System.out.println("2nd year   "+ (totalA + totalB+2));
    System.out.println("3rd year   "+ (totalA + totalB+3));
    System.out.println("4th year   "+ (totalA + totalB+4));
    System.out.println("5th year   "+ (totalA + totalB+5));
    // printed what would happen in the 5 years and added 2,3,4,5, to change the outcome for the 5 years
    System.out.println(" This is my estimations");
    

   
    


       
        
        
        
        
     
        
        
    }
}