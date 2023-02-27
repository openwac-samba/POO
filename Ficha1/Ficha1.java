public class Ficha1
{
    public double celsiusParaFar (double g)
    {
        return g* 1.8+ 32; 
    }
    public int maxNum (int a, int b)
    {
        return (a> b) ? a : b;
    }
    public String criaDescricaoConta(String nome, double saldo)
    {
        return (nome+ "\t"+ saldo);
    }
    public double eurosParaLibras(double valor, double taxaConversao)
    {
        return valor* taxaConversao;
    }
}