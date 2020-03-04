import java.util.*;

public class Phone 
{
    private String brand;
    private String model;
    private String wifi;   
    private String memory;
   
    
    public Phone(String strB, String strM, String strW, String strMe)
    {
        brand = strB;
        model = strM;
        wifi  = strW; 
        memory = strMe;
    }

   
    public String getBrand(String brand)
    {
        return brand;
    }
    
    public String getModel(String model)
    {
        return model;
    }
    
    public String getWifi(String wifi)
    {
        return wifi;
    }
    
    public String getMemory(String memory)
    {
        return memory;
    }
    public String toString()
    {
        return "BRAND:" + this.brand + " MODEL:" + this.model + " WIFI:" + this.wifi + " MEMORY:" + this.memory; 
    }
   
    
    public void phoneInfo()
    {
        System.out.println(" brand: " + brand);
        System.out.println(" model: " + model);
        System.out.println(" wifi: " + wifi);
        System.out.println(" memory: " + memory);
    }

    

    public static void main(String[]args)
    {
         
    }    

}
