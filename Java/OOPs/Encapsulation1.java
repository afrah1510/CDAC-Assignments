class BankAccount {
    private long accountNumber;
    private long balance;

    public long getAccountNo() {
        return accountNumber;
    }

    public void setAccountNo(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setAccountNo(2501648933321l);
        acc1.setBalance(25000000l);
        System.out.println("Account 1\nAccount Number: " + acc1.getAccountNo() + "\nBalance: Rs. " + acc1.getBalance());

        BankAccount acc2 = new BankAccount();
        acc2.setAccountNo(2501648956745l);
        acc2.setBalance(50000l);
        System.out.println("Account 2\nAccount Number: " + acc2.getAccountNo() + "\nBalance: Rs. " + acc2.getBalance());
    }
}
