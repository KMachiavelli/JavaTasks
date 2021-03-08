package AbstractTask;

public class Main{

    public static void main (String args[])
    {
        Dog dog = new Dog();
        Cat cat = new Cat();

        
        

        System.out.print("Dog goes ");
        dog.sound();

        System.out.print("\nCat goes ");
        cat.sound();

        System.out.println("\nDogs legs = " + dog.legs + "\nCats eyes = " + cat.eyes);

    
    }


}