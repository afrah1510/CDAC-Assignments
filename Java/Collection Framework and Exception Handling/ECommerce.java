import java.util.Scanner;

class TimeOutException extends Exception {
    TimeOutException(String msg) {
        super(msg);
    }
}

class InvalidCardException extends Exception {
    InvalidCardException(String msg) {
        super(msg);
    }
}

class InsufficientFundException extends Exception {
    InsufficientFundException(String msg) {
        super(msg);
    }
}

public class ECommerce {
    public static void main(String[] args) {
        try {
            long cardNo;
            int cvv, expiryMonth, expiryYear;
            double amount, balance;
            long timeOut = 2L * 60000 * 1000000;
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter card details for processing your payment -----");

            long start = System.nanoTime();

            System.out.println("Enter card number: ");
            cardNo = sc.nextLong();
            System.out.println("Enter CVV: ");
            cvv = sc.nextInt();
            System.out.println("Enter card expiry month: ");
            expiryMonth = sc.nextInt();
            System.out.println("Enter card expiry year: ");
            expiryYear = sc.nextInt();
            if (cardNo < 0000000000000001 || cardNo > 9999999999999999l) {
                throw new InvalidCardException("Card details are invalid.");
            } else if (cvv < 001 || cvv > 999) {
                throw new InvalidCardException("Card details are invalid.");
            } else if (expiryMonth < 01 || expiryMonth > 12) {
                throw new InvalidCardException("Card details are invalid.");
            } else if (expiryYear < 25) {
                throw new InvalidCardException("Card details are invalid.");
            }

            System.out.println("\nEnter balance: ");
            balance = sc.nextInt();
            System.out.println("Enter amount: ");
            amount = sc.nextInt();
            if (balance < amount) {
                throw new InsufficientFundException("You don't have sufficient balance to complete the payment.");
            }

            long finish = System.nanoTime();
            long timeElapsed = finish - start;

            if (timeElapsed > timeOut) {
                throw new TimeOutException("Payment gateway timeout. Took too long to complete payment.");
            }

            System.out.println("Payment done!");

        } catch (TimeOutException te) {
            System.out.println(te);
        } catch (InvalidCardException ie) {
            System.out.println(ie);
        } catch (InsufficientFundException fe) {
            System.out.println(fe);
        }
    }
}
