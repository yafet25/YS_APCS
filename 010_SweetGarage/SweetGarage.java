public class SweetGarage
{
    public static void main(String[] args)
    {

    Car jerry= new Car(1999, 99288, "KOKO", "mamaS4", true);
    
    Car mufasa= new Car(1972, 0, "LION KING","MUfasa6473637",true);
    
    Car judy= new Car( 1778, 6312263, "jdkj", "HHHHHH",false);
   
    Car hobbs=new Car(2018, 763,"KING"," Lobby24",true);
    //made an object and whats in the new car is year, miles, brand,model, and turbo
    System.out.println("jerry has a with car " + jerry.year+ " "+ jerry.milesDriven+ " "+ jerry. manufacturerName+ " "+jerry.modelName);
     jerry.engageTurbo();
   
    System.out.println("Mufasa has a with car  " + mufasa.year + " "+ mufasa.milesDriven+ " " + mufasa. manufacturerName+ " "+mufasa.modelName);
    mufasa.engageTurbo();
    
    
    System.out.println("judy has a with car  " + judy.year+" "+  judy.milesDriven+ " "+ judy. manufacturerName+ " "+ judy.modelName );
    judy.engageTurbo();
    
    System.out.println(" hobbs has a with car  " + " " + hobbs.year + " " + hobbs.milesDriven + " " + hobbs. manufacturerName + " " + hobbs.modelName );
    //System.out.println("hobbs milesDriven " + hobbs.milesDriven );
    //System.out.println("hobbs manufacturerName " + hobbs.modelName);
    //System.out.println("hobbs modelName" +hobbs.modelName);
    hobbs.engageTurbo();
    //made strings and added what my varibles said and had to do it in that order because if i didnt it wouldnt work
    
    }
}