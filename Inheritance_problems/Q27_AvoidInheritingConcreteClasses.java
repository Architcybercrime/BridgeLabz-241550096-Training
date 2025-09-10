interface Storage { void save(String data); }

class FileStorage implements Storage {
    public void save(String data){ System.out.println("Saved to file: " + data); }
}

public class Q27_AvoidInheritingConcreteClasses {
    public static void main(String[] args){ Storage s = new FileStorage(); s.save("hello"); }
}