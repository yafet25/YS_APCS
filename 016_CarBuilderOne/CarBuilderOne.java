import java.util.Scanner;
public class CarBuilderOne
{
    public static void main(String[] args) 
    {
        int year;
        int miles;
        String model;
        String brand;
        boolean turbo;
        //made varibles
       
     
        Scanner scan= new Scanner(System.in);
     
        System.out.println(" whats your ideal brand?");
        brand = scan.nextLine();
        //asked a question and made it print to nexling
        
        System.out.println(" whats your ideal model");
        model = scan.nextLine();
        
        System.out.println("what year would you like");
        year = scan.nextInt();
        
        System.out.println("whats your ideal milage");
        miles= scan.nextInt();
        
        System.out.println();
        
        System.out.println("true or false");
        turbo = scan.nextBoolean();
        //asking if theres turbo
        
        Car jerry= new Car(year,miles,brand,model, turbo);
        System.out.println("i found a " + jerry.manufacturerName + jerry.modelName+ " with " + jerry.year + " that has " + jerry.milesDriven+ " and has "+ jerry.hasTurbo );
        //when printed showed all he things it found
    }

}

