public class CarAge
{
    public static void main(String[] args)
    {
    ReturningCalculator calc= new ReturningCalculator();
    Car jerry= new Car(1999, 99288, "KOKO", "mamaS4", true);
    Car mufasa= new Car(1972, 0, "LION KING","MUfasa6473637",true);
    Car judy= new Car( 1778,6312263, "jdkj", "HHHHHH",false);
    Car hobbs=new Car(1889,0,"KING"," Lobby24",true);
    //stated new car and made all my cars
    
    int currentA= 2019;
    System.out.println(" my first car is " + calc.integerSubtractor(currentA,jerry.year)+ " years old");
    System.out.println(" my second car is " + calc.integerSubtractor(currentA,mufasa.year)+ " years old");
    System.out.println(" my third car is " + calc.integerSubtractor(currentA, judy.year)+ " years old");
    System.out.println(" my fourth car is " + calc.integerSubtractor(currentA, hobbs.year)+ " years old");
    // put them in all one string for the years
    //interger subtractor subtracts the years atomaticly

    
    }
}