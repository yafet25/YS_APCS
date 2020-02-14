import java.util.Scanner;
public class AbecedarianWords
{
    public static void main(String[] args) {
        
        String abece;
        int abeceOrNot=0;
        //made a string variable for abece, and set int equaled to 0
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        // made a scanner variable so you can enter a word
        abece = scan.next();
        int length = abece.length();
       
        for (int i=0; i < length-1; i++){
          
          String letter2 = abece.substring(i,i+1);
          String letter = abece.substring(i+1,i+2);
          if (letter2.compareToIgnoreCase(letter) < 0)
          {
           abeceOrNot+=1;
           }
          else
          {
           abeceOrNot -=100;
          }
         
         

          if (abeceOrNot > 0)
          {
            System.out.println("it is abece");
          }
          else
          {
           System.out.println("it is not a abece");
          }
        }
      }
      
    }