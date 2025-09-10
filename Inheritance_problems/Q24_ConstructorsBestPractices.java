class BaseC {
    BaseC(){ init(); } // calls final method only (safe)
    protected final void init(){ System.out.println("Base initialized"); } // final to avoid subclass override during construction
}

class SubC extends BaseC {
    // Additional setup in constructor (after base fully constructed)
    SubC(){ System.out.println("Sub constructed"); }
}

public class Q24_ConstructorsBestPractices {
    public static void main(String[] args){ new SubC(); }
}