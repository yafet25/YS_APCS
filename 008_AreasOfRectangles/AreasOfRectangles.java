public class AreasOfRectangles
{
    public static void main(String[] args)
    {
        double conInchCm= 2.54;
        double milCm=10;
        double inchFt= 12;
        double feetYd=3;
        // what the varibles transition to

    double widthRec1= 5.5;
    double heightRec1= 7.8;
    double totalAreaRec1=  widthRec1 * heightRec1;
    System.out.println("the area of first rectangle is " + totalAreaRec1);
    double widthRec2= 99.4;
    double heightRec2= 500.352;
    double totalAreaRec2=  widthRec2 * heightRec2;
    System.out.println("the area of second rectangle is " + totalAreaRec2);
    double widthRec3= 75;
    double heightRec3= 800;
    double totalAreaRec3=  (widthRec3 * conInchCm)* heightRec3;
    System.out.println("the area of third rectangle is " + totalAreaRec3);
    double widthRec4= 500029.75;
    double heightRec4= 90029384;
    double totalAreaRec4=  (widthRec4 * conInchCm)* heightRec4;
    System.out.println("the area of fourth rectangle is " + totalAreaRec4);
    double widthRec5= 600000.0;
    double heightRec5= 8343491034.0;
    double totalAreaRec5= ((((widthRec5 * conInchCm) *  milCm)* inchFt)*feetYd) * (((heightRec5 * milCm)*inchFt)*feetYd);
    System.out.println("the area of fifth rectangle is " + totalAreaRec5);

    }

}
