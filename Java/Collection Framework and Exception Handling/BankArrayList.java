import java.util.*;

class Bank {
    String name;
    int accountNo;
    long initialBalance;

    Bank(String name, int accountNo, long initialBalance) {
        this.name = name;
        this.accountNo = accountNo;
        this.initialBalance = initialBalance;
    }

    public String toString() {
        return "\nName: " + name + "\nAccount Number: " + accountNo + "\nBalance: " + initialBalance;
    }
}

public class BankArrayList {
    static void displayAccounts(Collection<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        String name;
        int accountNo;
        long initialBalance;
        int choice;

        Scanner sc = new Scanner(System.in);
        List<Bank> list1 = new ArrayList<>();

        list1.add(new Bank("Aliza", 225690, 20000));
        list1.add(new Bank("Dante", 225321, 200000));
        list1.add(new Bank("Vernon", 225753, 2500000));
        list1.add(new Bank("Aileen", 225009, 50000));
        list1.add(new Bank("Samuel", 225886, 650000));
        list1.add(new Bank("Jun", 225343, 4000000));
        list1.add(new Bank("Dino", 225105, 2350000));
        list1.add(new Bank("Woozi", 225014, 5600000));

        // System.out.println("List of all Bank Account Details");
        // displayAccounts(list1);

        do {
            System.out.println("\n\nChoose your option");
            System.out.println("1. Deposit money by Account Number");
            System.out.println("2. Withdraw money by Account Number");
            System.out.println("3. View account details by Account Number");
            System.out.println("4. Transfer money by Account Number");
            System.out.println("5. To quit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter the account number to deposit money: ");
                    int depositAccount = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nEnter the amount to be deposited: ");
                    long depositAmount = sc.nextLong();
                    sc.nextLine();

                    boolean found1 = false;
                    for (Bank b : list1) {
                        if (b.accountNo == depositAccount) {
                            b.initialBalance = b.initialBalance + depositAmount;
                            System.out.println("\nDeposit successful!");
                            found1 = true;
                            break;
                        }
                    }
                    if (found1 == false) {
                        System.out.println("\nBank account with " + depositAccount + " not found.");
                    }
                    break;

                case 2:
                    System.out.println("\nEnter the account number to withdraw money: ");
                    int withdrawAccount = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nEnter the amount to be withdrawn ");
                    long withdrawAmount = sc.nextLong();
                    sc.nextLine();

                    boolean found2 = false;
                    for (Bank b : list1) {
                        if (b.accountNo == withdrawAccount) {
                            found2 = true;
                            if (b.initialBalance > withdrawAmount) {
                                b.initialBalance = b.initialBalance - withdrawAmount;
                                System.out.println("\nWithdraw successful!");
                            } else {
                                System.out.println("Insufficient balance to withdraw money.");
                            }
                            break;
                        }
                    }
                    if (found2 == false) {
                        System.out.println("\nBank account with " + withdrawAccount + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nEnter the account number to view balance: ");
                    int viewAccount = sc.nextInt();
                    sc.nextLine();

                    boolean found3 = false;
                    for (Bank b : list1) {
                        if (b.accountNo == viewAccount) {
                            System.out.println("\nAccount Details: ");
                            System.out.println(b);
                            found3 = true;
                            break;
                        }
                    }
                    if (found3 == false) {
                        System.out.println("\nBank account with " + viewAccount + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nEnter the account number from which to transfer money: ");
                    int fromAccount = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nEnter the account number to which you want to transfer money: ");
                    int toAccount = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nEnter the amount to be transfered: ");
                    long transferAmount = sc.nextLong();
                    sc.nextLine();

                    boolean found4 = false;
                    for (Bank b : list1) {
                        if (b.accountNo == fromAccount) {
                            found4 = true;
                            if (b.initialBalance > transferAmount) {
                                b.initialBalance = b.initialBalance - transferAmount;
                                System.out.println("\nTransfer successful!");
                                System.out.println("Money transferred to bank account " + toAccount);
                            } else {
                                System.out.println("Insufficient balance to transfer money.");
                            }
                            break;
                        }
                    }
                    if (found4 == false) {
                        System.out.println("\nBank account with " + fromAccount + " not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}