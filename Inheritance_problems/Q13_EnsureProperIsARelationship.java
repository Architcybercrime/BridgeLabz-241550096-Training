class AnimalBase { void eat(){ System.out.println("Animal eats"); } }
class DogIsA extends AnimalBase { void bark(){ System.out.println("Dog barks"); } } // Dog is-a Animal

public class Q13_EnsureProperIsARelationship {
    public static void main(String[] args){ AnimalBase a = new DogIsA(); a.eat(); }
}