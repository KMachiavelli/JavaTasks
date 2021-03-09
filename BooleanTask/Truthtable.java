package BooleanTask;

public class Truthtable {
    


public static void main(String[] args)
{
     boolean p = false;
     boolean q = false;

    Testbench testbench = new Testbench();
    for(int i = 0; i<=3 ; i++)
    {

        switch(i){

            case 0:
            testbench.testAND(p,q);

            case 1:
            testbench.testOR(p,q);

            case 2:
            testbench.testXOR(p,q);

            case 3:
            testbench.testXAND(p,q);



        }
        



    }
}




}
