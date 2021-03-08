package AbstractTask;

public class Main{

    public static void main (String args[])
    {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal chicken = new Chicken(); // <--- Odniesienie do klasy nadrzednej Animal, zamiast do Chicken
        Dog.Stomach stomach =  dog.new Stomach();// <---deklaracja obiektu klasy w klasie

        stomach.howmanykidneys();

        
       chicken.stepsSound();// <---- funkcja wyswietla to co ma kurak, nie abstrakcyjna Animal

        System.out.print("Dog goes ");
        dog.sound();

        System.out.print("\nCat goes ");
        cat.sound();

        System.out.println("\nDogs legs = " + dog.legs + "\nCats eyes = " + cat.eyes);

    
    }


}