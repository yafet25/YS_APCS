public class TabletopDice
{
    public static void main(String[]args)
    {
        int d10= (int)(Math.random()*10 + 1); 
        
        int d4= (int)(Math.random()*4 + 1); 
        
        int d6= (int)(Math.random()*6 + 1); 
        
        int d8= (int)(Math.random()*8 + 1); 
        
        int d12= (int)(Math.random()*12 + 1); 
        
        int d20= (int)(Math.random()*20 + 1); 
        
        int d11= (int)(Math.random()*10 + 1)*10;
        //made dice and at random go up or down depending on how much its mutliplied by

        System.out.println(d10);
       
        System.out.println(d4);
       
        System.out.println(d6);
        
        System.out.println(d8);
        
        System.out.println(d12);
        
        System.out.println(d20);
        
        System.out.println(d11);
        //prints what they would do and not the same asnwer everytime
     }

}