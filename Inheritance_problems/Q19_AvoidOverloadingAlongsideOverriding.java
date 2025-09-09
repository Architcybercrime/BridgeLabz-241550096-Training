class PrinterBase {
    void print(String s){ System.out.println("Base: " + s); }
}

class SmartPrinter extends PrinterBase {
    @Override void print(String s){ System.out.println("Smart: " + s.toUpperCase()); } // clear override
    void printLines(String[] lines){ // different, clearly named method instead of overload confusion
        for(String l: lines) System.out.println(l);
    }
}

public class Q19_AvoidOverloadingAlongsideOverriding {
    public static void main(String[] args){
        SmartPrinter p = new SmartPrinter();
        p.print("hello");
        p.printLines(new String[]{"a","b"});
    }
}