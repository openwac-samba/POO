import java.util.Scanner;

public class Num
{
    private static double areaCirculo (double r)
    {
        return Math.PI* Math.pow(r, 2);
    }
    public static void main (String[] args)
    {
        Scanner scan= new Scanner(System.in);
        double radius= scan.nextDouble();
        System.out.println ("Área:" +areaCirculo (radius));
        scan.close();
    }    
}