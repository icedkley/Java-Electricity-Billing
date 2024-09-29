import java.util.Scanner;

public class PayableAccount extends BillableAccount {
    static Scanner scanner = new Scanner(System.in);

    public PayableAccount(int accountNumber, String accountName, float prev) {
        super(accountNumber, accountName, prev);
    }

    public void printReciept(int amount) {
        float change = amount - getBill();

        if (amount < getBill()) {
            System.out.println("\nInvalid Amount, Please Try Again");
            System.out.print("Enter Amount in PHP: ");
            int amount2 = scanner.nextInt();

            printReciept(amount2);
        } else {
            System.out.println("\nPayment Successful, Please review your transaction\n");
            System.out.println("Account Number:" + getAccountNumber());
            System.out.println("Current Bill: " + getBill());
            System.out.println("Amount Paid in Cash: " + amount);
            System.out.println("Your Change is: " + change + "\n\n");
        }
    }

    public void payBill() {
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Previous Meter Reading: " + getPrev());
    }
}