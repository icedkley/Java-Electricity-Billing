import java.util.*;

public class Main {


    public static void main(String[] args){

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(12345, "Kyle Belvis",  1000));
        accounts.add(new Account(67890, "Runelo John",  500));
        accounts.add(new Account(24680, "Leandre Itona",  500));

        System.out.println("Welcome to Electricity Billing\n");
        System.out.println("1. Open My Account");
        System.out.println("2. Create New Account\n");


        System.out.print("Please choose an option: ");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        
         if(userInput == 1){
            System.out.println("\nOpen My Account");
            System.out.print("Enter Account number: ");
            int userInput1 = scanner.nextInt();


            boolean accountFound = false;
            for (Account account : accounts) {
                if (userInput1 == account.getAccountNumber()) {
                    System.err.println("\nHello, " + account.getAccountName() +  "\n");
                    account.displayAccountDetails();
                    accountFound = true;
                }
                if(!accountFound){
                    System.out.println("Eror no account found");
                }
            }
        }
    }
       
}