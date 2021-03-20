public class BubbleSort {
    


    void sortnumbers(int x[],boolean permission)
    {

       
if(permission)
    {
        for (int i = 0; i < x.length -1  ; i++)
        {
            for (int j = 0; j < x.length - i -1 ; j++)
            {
                if(x[j+1] < x[j])
                {
                    int h;
                    h = x[j];
                    x[j] = x[j+1];
                    x[j+1] = h;
                }
            }
        }
    }

    
    }

    void sortwords (String x[],boolean permission)
    {
        int k=0;
        if(permission)
        {
     
        for (int i = 1; i < x.length   ; i++)
        {
            for (int j = 1; j < x.length - i  ; j++)
            {
                while(x[j+1].charAt(k) == x[j].charAt(k) && !x[j].equals(x[j+1]))
                    {
                        k++;
                    }

                if(x[j+1].charAt(k) < x[j].charAt(k) && !x[j].equals(x[j+1]))
                { 
                    String h;
                    
                    h = x[j];
                    x[j] = x[j+1];
                    x[j+1] = h;

                    k=0;
                }
            }
        }
    }

    }

    void printliczby(int x[], boolean permission)
    {
        
        if(permission)
        {
        for (int i=0; i<x.length; i++)
        {
            
            if(i==0)
            System.out.print("Posorotwane liczby: " + x[i] + " ");

            else{System.out.print(x[i] + " ");}

        }
    }
    }

    void printslowa(String[] x, boolean permission)
    {
        
        if(permission)
        {
        for (int i=0; i<x.length; i++)
        {
            
            if(i==0)
            System.out.print("Posorotwane slowa: " + x[i] + " ");

            else{System.out.print(x[i] + " ");}

        }
    }
    }


}
