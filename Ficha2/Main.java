import java.util.*;
import java.lang.Integer;

public class Main 
{
    private static String ex1 (Ficha2 ficha, Scanner input)
    {
        System.out.println ("Introduza tamanho do array:");
        int n= input.nextInt ();
        int[] a= new int[n];
        for (int i= 0; i< n; i++)
            a[i]= input.nextInt();
        return "O valor máximo do array é: " + Integer.toString(ficha.max (a, n));
    }
    private static String ex2 (Ficha2 ficha, Scanner input)
    {
        System.out.println ("Introduza o tamanho do array:");
        int n= input.nextInt();
        int[] a= new int[n];
        System.out.println ("Introduza o intervalo que deseja:");
        int x= input.nextInt();
        int y= input.nextInt();
        System.out.println("Introduza os membros do array:");
        for (int i= 0; i< n; i++)
            a[i]= input.nextInt();
        return "Os valores do índex são: "+ Arrays.toString (ficha.byindex (x, y, a));
    }
    private static String ex3 (Ficha2 ficha, Scanner input)
    {
        System.out.println ("Introduza o tamanho dos arrays:");
        int N= input.nextInt();
        int a[]= new int[N];
        int Y= input.nextInt();
        int b[]= new int[Y];
        System.out.println ("Introduza o 1º array:");
        for (int i= 0; i< N; i++)
            a[i]= input.nextInt();
        System.out.println ("Introduza o 2º array:");
        for (int i= 0; i< Y; i++)
            b[i]= input.nextInt();
        return "Os valores em comum são: "+ Arrays.toString(ficha.cross(a, N, b, Y));
    }
    private static String ex4 (Scanner input)
    {

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
        Ficha2 ficha= new Ficha2 ();
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
                s= ex4 (input);
                break;
            default:
                break;
        }
        System.out.println (s);
        input.close ();
    }
}
