import java.util.Scanner;

public class ShippingCalculator
{
    public static void main(String[]args)
    {
        Double priceA= 3.5;
        
        Double priceB=5.5;
        
        Double priceC= 8.5;
        
        Double priceD= 10.5;  
        
        // made varibles 
        Double w;
        
       // made a scanner so I can write a statment in the program 
        Scanner scan= new Scanner(System.in);
        System.out.println("what is the weight of the package");
        w = scan.nextDouble();
        
        if(w <= 1 && w > 0){
            System.out.println("the cost of the package " + priceA );
        }
        //made an if stament that tells you the weight and how much money it cost for the package
        else if(w <= 3 && w > 1){
            System.out.println("the cost of the package " + priceB );
        }
        //made an if stament that tells you the weight and how much money it cost for the package
        else if(w <= 10 && w > 3){
            System.out.println("the cost of the package " + priceC );
        }
        //made an if stament that tells you the weight and how much money it cost for the package
        else if(w <= 20 && w >  10){
            System.out.println("the cost of the package " + priceD );
        }
        //made an if stament that tells you the weight and how much money it cost for the package
        else{
            System.out.println("This package is to big to ship");
        }
        //made an if stament that tells you the weight and how much money it cost for the package

        

    }


}