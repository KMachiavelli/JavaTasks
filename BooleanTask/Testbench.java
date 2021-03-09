package BooleanTask;

public class Testbench {
    
    boolean Q;

    public void testAND(boolean p, boolean q)
    {
       
       
        System.out.println("TABELA AND:");
        System.out.println("p"+"\tq"+"\tQ");

        for(int i=0; i<4;i++){
            switch(i){
    
    case 0:
    p = false;
    q = false;
    break;
    
    case 1:
    p = false;
    q = true;
    break;
    
    case 2:
    p = true;
    q = false;
    break;
    
    case 3:
    p = true;
    q = true;
    break;
            
    
            }
            Q = p & q;

//istnieje rowniez warunek operatorowy && ktory sprawdza czy juz sam pierwszy wyraz nie jest 0, bo wtedy i tak nie warto dalej sprawdzac
//analogicznie || i 1.           
System.out.println(p +"\t"+ q +"\t"+ Q);
    
            }


    } 

    public void testOR(boolean p, boolean q)
    {

      
       System.out.println("TABELA OR:");
       System.out.println("p"+"\tq"+"\tQ");
       for(int i=0; i<4;i++){
        switch(i){

case 0:
p = false;
q = false;
break;

case 1:
p = false;
q = true;
break;

case 2:
p = true;
q = false;
break;

case 3:
p = true;
q = true;
break;
        

        }
        Q = p | q;
        System.out.println(p +"\t"+ q +"\t"+ Q);

        }
    }

    public void testXOR(boolean p, boolean q)
    {

      

        System.out.println("TABELA XOR:");
        System.out.println("p"+"\tq"+"\tQ");
        for(int i=0; i<4;i++){
            switch(i){
    
    case 0:
    p = false;
    q = false;
    break;
    
    case 1:
    p = false;
    q = true;
    break;
    
    case 2:
    p = true;
    q = false;
    break;
    
    case 3:
    p = true;
    q = true;
    break;
            
    
            }
            Q = p ^ q;
            System.out.println(p +"\t"+ q +"\t"+ Q);
    
            }

    }

    public void testXAND(boolean p, boolean q)
    {

      

        System.out.println("TABELA XAND:");
        System.out.println("p"+"\tq"+"\tQ");
        for(int i=0; i<4;i++){
            switch(i){
    
    case 0:
    p = false;
    q = false;
    break;
    
    case 1:
    p = false;
    q = true;
    break;
    
    case 2:
    p = true;
    q = false;
    break;
    
    case 3:
    p = true;
    q = true;
    break;
            
    
            }
            Q = !(p^q);
            System.out.println(p +"\t"+ q +"\t"+ Q);
    
            }

    }




}
