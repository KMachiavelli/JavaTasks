package BreakContinueTask;

public class Continue {

    public void nieparzyste()
    {

        for(int i=1; i<100; i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }

    }
    
}
