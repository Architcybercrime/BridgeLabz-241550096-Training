class BankAccount {
    static String bankName = "SBI Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Archit", 1001, 50000);
        b1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}