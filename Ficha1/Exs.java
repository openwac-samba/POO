import java.util.Scanner;
import java.lang.Integer;

public class Exs
{
    private static String ex1 (Ficha1 ficha, Scanner input)
    {
        System.out.println ("Insira um valor em graus:");
        double celsius= input.nextDouble();
        double far= ficha.celsiusParaFar (celsius);
        return ("\n"+ celsius+ " graus celsius são "+ far+ " graus farenheit.");
    }
    private static String ex2 (Ficha1 ficha, Scanner input)
    {
        System.out.println ("Insira dois valores:");
        int r= ficha.maxNum(input.nextInt(), input.nextInt());
        return ("O maior número é: "+ r);        
    }
    private static String ex3 (Ficha1 ficha, Scanner input)
    {
        System.out.println ("Insira um nome e um saldo:");
        return ficha.criaDescricaoConta(input.nextLine(), input.nextDouble());
    }
    private static String ex4 (Ficha1 ficha, Scanner input)
    {
        System.out.println("Insira um valor em euros e uma taxa de conversão para libras");
        return ("Em Libras:\t"+ ficha.eurosParaLibras(input.nextDouble(), input.nextDouble()));
    }
    public static void main (String[] args)
    {
        if (args.length== 0)
        {
            System.out.println ("No args? *insert MegaMind meme*");
            System.exit(0);
        }
        int n= Integer.parseInt (args[0]);                                      //Num Exercicio
        Scanner input= new Scanner (System.in);
        Ficha1 ficha= new Ficha1 ();
        String s= "";
        switch (n)
        {
            case 1:
                s= ex1 (ficha, input);
                break;
            case 2:
                s= ex2 (ficha, input);
                break;
            case 3:
                s= ex3 (ficha, input);
                break;
            case 4:
                s= ex4 (ficha, input);
                break;
            default:
                break;
        }
        System.out.println (s);
        input.close ();
    }
}