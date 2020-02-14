import javax.lang.model.util.ElementScanner6;

public class FlipACoin
{
    public static void main(String[]args)
    {
        double coin= Math.random();

        if (coin > 0.5)
        {
            System.out.println("heads");
        }
        else
        {
            System.out.println("tails");
            // made an if statment that if if greater than 5 heads less than tails and we used random to get random asnwer
        }
    }
}