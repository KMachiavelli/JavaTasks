package BreakContinueTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choose;
        choose = input.nextInt();


        if(choose == 1)
        {
        BreakEtykieta brejk = new BreakEtykieta();
        }

        if(choose == 2)
        {
            Continue cont = new Continue();
            cont.nieparzyste();
        }




    }
    
}
