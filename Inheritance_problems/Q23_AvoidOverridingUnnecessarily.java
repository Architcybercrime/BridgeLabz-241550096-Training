class Notifier {
    void notifyUser(String msg){ System.out.println("Notify: " + msg); }
}

class EmailNotifier extends Notifier {
    // No override since base behavior is sufficient for this demo
    void send(String msg){ notifyUser(msg); }
}

public class Q23_AvoidOverridingUnnecessarily {
    public static void main(String[] args){ new EmailNotifier().send("Welcome!"); }
}