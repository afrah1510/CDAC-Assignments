class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    BankAccount(int accountNumber, String holderName) {
        this(accountNumber);
        this.holderName = holderName;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this(accountNumber, holderName);
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        if (holderName != null) {
            System.out.println("Holder Name: " + holderName);
        } else {
            System.out.println("Holder Name: N/A");
        }
        if (balance != 0) {
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Balance: N/A");
        }
    }
}

public class ConstructorChaining5 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(252200316);
        b1.displayAccountDetails();
        System.out.println();
        BankAccount b2 = new BankAccount(252200254, "Dante");
        b2.displayAccountDetails();
        System.out.println();
        BankAccount b3 = new BankAccount(252200070, "Aileen", 3502500);
        b3.displayAccountDetails();
        System.out.println();
    }
}
