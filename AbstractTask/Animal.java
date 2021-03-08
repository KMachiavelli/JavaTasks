package AbstractTask;

//piszac "final class Animal" nikt juz po niej nie bedzie dziedziczyl 
//abstract definiuje ogol, ale nie na przyklad dzialanie bloczka funkcji

public /*abstract*/ class Animal{

    protected int eyes = 2;

    void sound()
    {
    }
    
    protected void stepsSound()
    {
        System.out.println("tup tup tup");
    }


}