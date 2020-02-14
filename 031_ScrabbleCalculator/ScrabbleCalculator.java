import java.util.Scanner;
public class ScrabbleCalculator
{
    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e",  
           "f", "g", "h", "i",
           "j",   "k", "l", "m", "n", "o", 
           "p", "q", "r", "s", "t",   "u", "v",
           "w", "x", "y", "z"};

        int[] values = {1, 3, 3, 2, 1, 4,  
           2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10,
           1, 1, 1, 1, 4, 4, 8, 4, 10};

        Scanner scrabbleW = new Scanner(System.in);
        System.out.println("Yo BrO, Ya Im TaLkInG tO yOu, TyPe A WoRd");

        String choice = scrabbleW.nextLine();

        int score = 0;
        for(int i = 0; i < choice.length(); i++) {
            for(int n = 0; n < 26; n++)   {
                if(choice.substring(i).equals(alphabet[n]))
                {
                   score += values[n];
                }
            }
         }

      }   System.out.println("your score for this word is  " + score);
   }
        
        

}