package BooleanTask;

public class Testbench {
    
    boolean Q;

    public void testAND(boolean p, boolean q)
    {
       
       
        System.out.println("TABELA AND:");
        System.out.println("  p  "+"  q  "+"  Q  ");

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
            System.out.println(p +" "+ q +" "+ Q);
    
            }


    } 

    public void testOR(boolean p, boolean q)
    {

      
       System.out.println("TABELA OR:");
       System.out.println("  p  "+"  q  "+"  Q  ");
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
        System.out.println(p +" "+ q +" "+ Q);

        }
    }

    public void testXOR(boolean p, boolean q)
    {

      

        System.out.println("TABELA XOR:");
        System.out.println("  p  "+"   q  "+"   Q  ");
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
            System.out.println(p +" "+ q +" "+ Q);
    
            }

    }

    public void testXAND(boolean p, boolean q)
    {

      

        System.out.println("TABELA XAND:");
        System.out.println("  p  "+"   q  "+"   Q  ");
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
            System.out.println(p +" "+ q +" "+ Q);
    
            }

    }




}
