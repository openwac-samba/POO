import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args)
    {
        Scanner input= new Scanner (System.in);
        Ficha1 ficha= new Ficha1 ();
        System.out.println ("Insira dois números:\n");
        int n= ficha.maxNum (input.nextInt(), input.nextInt());
        System.out.println ("O máx dos números é: "+ n+ "\n");
        input.close ();
    }
}