interface Loggable { void log(String msg); }
class Service implements Loggable {
    public void log(String msg){ System.out.println("LOG: " + msg); }
    void run(){ log("service running"); }
}
public class Q21_UseInterfacesForMultipleInheritance {
    public static void main(String[] args){ new Service().run(); }
}