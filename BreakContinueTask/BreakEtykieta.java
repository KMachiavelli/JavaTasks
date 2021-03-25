package BreakContinueTask;

public class BreakEtykieta {

    BreakEtykieta()
    {
        int i;

        for(i=0; i<3; i++)
        {
        etykieta3: {
            etykieta2: {
                etykieta1: {

                    System.out.println("Iteracja nr " + i);

                   
            if(i==0)
            break etykieta1;
            

            
                if(i==1)
                break etykieta2;
                

                
                    if(i==2)
                    break etykieta3;

                    //Tu juz by byly tylko elementy nieosiągalne dla programu z racji przeskoku do etykiety
                               

                           }
                           System.out.println("Etykieta wewnetrzna");
                        }
                        System.out.println("Etykieta srodkowa");
                    }
                    System.out.println("Etykieta zewnetrzna");



                    

        }

        

        

    }
    
}
