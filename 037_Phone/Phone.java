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

    public String setBrand(String brand)
    {
        this.brand = brand;
        System.out.println("The brand is " + brand + " ");
        return brand;
    }
    public void phoneInfo()
    {
        System.out.println(" brand: " + brand);
        System.out.println(" model: " + model);
        System.out.println(" wifi: " + wifi);
        System.out.println(" memory: " + memory);
    }

    

    

}