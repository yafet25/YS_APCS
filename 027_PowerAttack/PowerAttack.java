public class PowerAttack
{


    public static void main (String[] args)
    {
        int str = 3;
       
        int armourClass=11; 
        
        int currentAttack=attackRoll(str);
        //made a variable for the rolls
        
        while(currentAttack<=armourClass)
        {        
            System.out.println(currentAttack + " you didnt hit the monster,attack again "); 
            // based on your roll youll be able to hit the monster 
            
            
            
            currentAttack= attackRoll(str);       
        }   
        
       
        System.out.println("you hit the monster");
    }

    
    public static int attackRoll(int strengthMod)
    {
        return ((int)(Math.random()*10+1))+strengthMod;
        // mutlipes your number by 10 and then adds it by one
    }

}