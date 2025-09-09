class Formatter {
    String format(String s){ return "[" + s + "]"; }
}

class PrinterDelegation {
    private final Formatter formatter = new Formatter();
    void print(String s){ System.out.println(formatter.format(s)); }
}

public class Q28_UseDelegationForSpecialCases {
    public static void main(String[] args){ new PrinterDelegation().print("hello"); }
}