package CinSortTask;

import java.util.*;

public class Cin {
    
    int ileliczb;
    int[]  liczba; 

    int ileslow;
    String[] slowo;

    
    boolean numsortbool;
    boolean wordsortbool;

    

    Scanner input = new Scanner(System.in); //System.in to standard wejscia

    void write() throws java.io.IOException
    {

        System.out.println("Czy chcesz sortowac slowa, czy liczby? [slowa/liczby]");
      

        String decision;
        decision = input.nextLine();


         if (decision.equals("liczby"))
         {
             numsortbool = true;
            System.out.println("Ile liczb do posortowania?");
            ileliczb = input.nextInt();
    
            liczba = new int[ileliczb];
    
            System.out.println("Podaj liczby do sortowania:");
            for(int l=0; l < liczba.length ; l++)
            liczba[l] = input.nextInt();
        }
       
    
    
//generalnie nextLine wymaga "skonsumowania" pozostalosci po innych nextLineach




       if (decision.equals("slowa"))
       {
           wordsortbool = true;
           System.out.println("Ile slow do posortowania?");
           ileslow = input.nextInt();
   
           slowo = new String[ileslow+1];// +1 bo nextLine dziala troche inaczej
   
           System.out.println("Podaj slowa do sortowania:");
           for(int l=0; l < slowo.length ; l++)
           {
           slowo[l] = input.nextLine(); // de facto tablica/lista slow
         
           }

       }
    }


}
