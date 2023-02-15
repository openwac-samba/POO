import java.util.Scanner;
import java.lang.Integer;

public class Exs
{
    public static void ex1 (Ficha1 ficha, Scanner input)
    {
        System.out.println ("Insira um valor em graus:\n");
        double celsius= input.nextDouble();
        double far= ficha.celsiusParaFar (celsius);
        System.out.println (celsius+ " graus celsius são "+ far+ " graus farenheit.\n");
    }
    public static void main (String[] args)
    {
        int n= Integer.parseInt (args[0]);                                      //Num Exercicio
        Scanner input= new Scanner (System.in);
        Ficha1 ficha= new Ficha1 ();
        switch (n)
        {
            case 1:
                ex1 (ficha, input);
        }
        input.close ();
    }
}