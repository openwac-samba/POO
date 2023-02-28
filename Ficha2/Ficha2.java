import java.util.*;

public class Ficha2
{
    private boolean exists (int a[], int x)
    {
        for (int i= 0; i< a.length; i++)
        {
            if (a[i]== x)
                return true;
        }
        return false;
    }
    private int[] push (int a[], int pos, int x)
    {
        if (pos== a.length)
        {
            int[] r= Arrays.copyOf (a, a.length* 2);
            a= r;
        }
        a[pos]= x;
        return a;
    }
    //API
    public int max (int[] a, int N)
    {
        if (N>0)
        {
            int max= a[0];
            for (int i= 1; i< N; i++)
            {
                max= (max> a[i]) ? max : a[i];
            }
            return max;
        }
        else
            return 0;
    }
    public int[] byindex (int x, int y, int[] a)
    {
        int N= y- x;
        if (N> 0)
        {
            int r[]= new int[N];
            for (int i= 0; i< N; i++)
            {
                r[i]= a[x+ i];
            }
            return r;
        }
        else
            return null;
    }
    public int[] cross (int a[], int N, int b[], int Y)
    {
        if (N< Y)
        {
            int pos= 0;
            int r[]= new int [N];
            for (int i=0 ; i< N; i++)
                if (exists (b, a[i]))
                    r[pos++]= a[i];
            if (pos!= r.length)
            {
                int temp[]= Arrays.copyOf(r, pos);
                r= temp;
            }
            return r;
        }
        else
        {

            int pos= 0;
            int r[]= new int [Y];
            for (int i=0 ; i< Y; i++)
                if (exists (a, b[i]))
                    r[pos++]= b[i];
            if (pos!= r.length)
            {
                int temp[]= Arrays.copyOf(r, pos);
                r= temp;
            }
            return r;
        }        
    }
}