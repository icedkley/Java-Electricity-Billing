public class BillableAccount extends MeteredAccount {
    protected float bill;

    public BillableAccount(int accountNumber, String accountName, float prev) {
        super(accountNumber, accountName, prev);
    }

    public float getBill() {
        return bill;
    }

    public void setBill(float bill) {
        this.bill = bill;
    }

    public float calculateBill(float billInput) {
        bill = prev - billInput;
        System.out.println("Current bill is: " + bill * 12 + " PHP");
        return bill *= 12;
    }
}