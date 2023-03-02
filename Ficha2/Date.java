public class Date
{
    int dia, mes, ano;
    
    int compare (Date x, Date y)
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
}
