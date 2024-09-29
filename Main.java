import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //Creates an Array for Existing Users
        ArrayList<PayableAccount> accounts = new ArrayList<>();
        accounts.add(new PayableAccount(AccountNumberGenerator.generateAccountNumber(), "Kyle Belvis", 100));
        accounts.add(new PayableAccount(AccountNumberGenerator.generateAccountNumber(), "Runelo Yelo", 100));
        accounts.add(new PayableAccount(AccountNumberGenerator.generateAccountNumber(), "Leandre Itona", 100));

        System.out.println("\nWelcome to Electric Billing");
        
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMenu");
            System.out.println("1. Pay Bill");
            System.out.println("2. Create New Account");
            System.out.println("3. Exit");

            System.out.print("\nPlease choose an option: ");
            int userInput = scanner.nextInt();

            if(userInput == 1){
                System.out.println("\nPay bill");
                System.out.print("Enter Account Number: ");
                int accountNumber = scanner.nextInt();

                for(PayableAccount account: accounts){
                    if(account.getAccountNumber() == accountNumber){

                        account.displayAccountDetails();

                        if(account.getPrev() != 0){
                            System.out.print("Enter current reading: ");
                            int current = scanner.nextInt();
                            account.calculateBill(current);
    
                            System.out.print("\nEnter amount in PHP: ");
                            int amount = scanner.nextInt();
                            account.printReciept(amount);
                        }
                      
                        System.out.print("Enter 1 to Open Menu, Enter 2 to Exit: ");
                        int input = scanner.nextInt();
                        if(input == 2){
                            System.out.println("\nThank You for using Electric Billing");
                            System.out.println("Program closed.\n");
            
                            isRunning = false;
                        }
                    }
                };
            }
            
            else if(userInput == 2){
                System.out.println("Create New Account");
                System.out.print("Enter Fullname: ");
                scanner.nextLine();
                String name = scanner.nextLine();

                System.out.print("Enter Address: ");
                String address = scanner.nextLine();

                System.out.print("Enter Contact Number: ");
                String contactNum = scanner.nextLine();

                System.out.print("Enter E-mail Address: ");
                String email = scanner.nextLine();

                int accountNumber = AccountNumberGenerator.generateAccountNumber();

                accounts.add(new PayableAccount(accountNumber, name, 000));

                System.out.println("\nAccount Successfully Created Please review your information\n");
                System.out.println("Full Name: " + name);
                System.out.println("Address: " + address);
                System.out.println("Contact Number: " + contactNum);
                System.out.println("Email Address: " + email);
                System.out.println("Account Number: " + accountNumber);
                
                System.out.print("\nEnter 1 to Open Menu, Enter 2 to Exit: ");
                        int input = scanner.nextInt();
                        if(input == 2){
                            isRunning = false;
                        }
            }

            else if (userInput == 3){
                System.out.println("\nThank You for using Electric Billing");
                System.out.println("Program closed.\n");

                isRunning = false;
            }
        }

      
    };




}