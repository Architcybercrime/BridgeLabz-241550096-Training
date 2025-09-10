// Using template method to stabilize base behavior.
abstract class DataExporter {
    public final void export(){ load(); transform(); write(); }
    protected void load(){ System.out.println("Load data"); }
    protected abstract void transform();
    protected void write(){ System.out.println("Write output"); }
}

class CsvExporter extends DataExporter {
    @Override protected void transform(){ System.out.println("Transform to CSV"); }
}

public class Q26_BewareFragileBaseClass {
    public static void main(String[] args){ new CsvExporter().export(); }
}