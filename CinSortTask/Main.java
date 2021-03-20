import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException
    {
        
        BubbleSort bubblesort = new BubbleSort();
        Cin cin = new Cin();


    cin.write();

    bubblesort.sortnumbers(cin.liczba, cin.numsortbool);
    bubblesort.sortwords(cin.slowo, cin.wordsortbool);


    bubblesort.printliczby(cin.liczba, cin.numsortbool);
    bubblesort.printslowa(cin.slowo, cin.wordsortbool);        
        

    }
}
