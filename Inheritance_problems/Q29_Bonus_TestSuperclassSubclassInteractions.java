class CalcBase {
    int add(int a, int b){ return a + b; }
}

class SafeCalc extends CalcBase {
    @Override int add(int a, int b){ return Math.addExact(a, b); } // ensures no overflow silently
}

public class Q29_Bonus_TestSuperclassSubclassInteractions {
    public static void main(String[] args){
        CalcBase c1 = new CalcBase();
        CalcBase c2 = new SafeCalc();
        System.out.println(c1.add(2,3));
        System.out.println(c2.add(2,3));
    }
}