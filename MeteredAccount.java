public class MeteredAccount extends Account {
    protected float prev;

    public MeteredAccount(int accountNumber, String accountName, float prev) {
        super(accountNumber, accountName);
        this.prev = prev;
    }

    public float getPrev() {
        return prev;
    }

    public void setPrev(float prev) {
        this.prev = prev;
    }

    public void displayAccountDetails() {

        if(prev == 0){
            System.out.println("Account Number: " + getAccountNumber());
            System.out.println("Account Name: " + getAccountName());

            System.out.println("\nNOTICE: This Account is Newly Activated, Please wait 30 Days for proper meter reading.\n");

        }
        else{
            System.out.println("Account Number: " + getAccountNumber());
            System.out.println("Account Name: " + getAccountName());
            System.out.println("Previous Meter Reading: " + prev);
        }

     
    }
}