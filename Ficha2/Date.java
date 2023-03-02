public class Date
{
    int dia, mes, ano;

    public Date ()
    {
        this.ano= 2003;
        this.mes= 12;
        this.dia= 21;
    }
    public int compare (Date x, Date y)
    {
        int n;
        if ((n= x.ano- y.ano)!= 0)
            return n;
        if ((n= x.mes- y.mes)!= 0)
            return n;
        if ((n= x.dia- y.dia)!= 0)
            return n;
        return 0;
    }
    public int getDia ()
    {
        return dia;
    }
    public int getMes ()
    {
        return mes;
    }
    public int getAno ()
    {
        return ano;
    }
    public void setDia (int dia)
    {
        this.dia = dia;
    }
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }
}
