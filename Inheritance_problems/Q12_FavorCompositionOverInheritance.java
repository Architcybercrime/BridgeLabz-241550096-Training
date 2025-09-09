class Engine { void start(){ System.out.println("Engine starting"); } }

class CarComp { // has-a Engine (composition)
    private Engine engine = new Engine();
    void drive(){ engine.start(); System.out.println("Car driving"); }
}

public class Q12_FavorCompositionOverInheritance {
    public static void main(String[] args){ new CarComp().drive(); }
}