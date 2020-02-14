import java.util.Scanner;

public class DateTranslator {

    int month;
    int day;
    int year;
    String euru;
    public static void main(String[] args) {
        
        DateTranslator dateTran = new DateTranslator();

        

        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Enter a day");
        dateTran.day= kbd.nextInt();
        
        System.out.println("Enter a month");
        dateTran.month = kbd.nextInt();
        
        System.out.println("Enter a year");
        dateTran.year = kbd.nextInt();
        
        
        
    }
    public void us()
    {
        System.out.println(month + "/ " + day + " / " + year);
    }
        
}