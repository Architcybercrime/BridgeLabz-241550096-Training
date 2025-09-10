abstract class Notification {
    abstract void send(String to);
}

class SMS extends Notification {
    @Override void send(String to){ System.out.println("Sending SMS to " + to); }
}

class Email extends Notification {
    @Override void send(String to){ System.out.println("Sending Email to " + to); }
}

public class Q25_UsePolymorphismEffectively {
    public static void main(String[] args){
        Notification[] ns = { new SMS(), new Email() };
        for(Notification n : ns) n.send("Archit");
    }
}