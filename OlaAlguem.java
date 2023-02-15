public class OlaAlguem
{
    public static String geraSaudacao (String nome)
    {
        return "Olá "+nome+"!";
    }
    public static void main (String[] args)
    {
        String saudacao = geraSaudacao (args[0]);
        System.out.println (saudacao);
    }
}