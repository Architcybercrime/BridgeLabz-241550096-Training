class Payment {
    void pay(double amount){ System.out.println("Paid: " + amount); }
}

class CardPayment extends Payment {
    @Override void pay(double amount){ 
        // honors base behavior: doesn't restrict, only extends
        System.out.println("Card charged: " + amount);
    }
}

public class Q14_LiskovSubstitutionPrinciple {
    static void checkout(Payment p){ p.pay(100); }
    public static void main(String[] args){ checkout(new CardPayment()); }
}