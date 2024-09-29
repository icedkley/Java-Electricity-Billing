public class AccountNumberGenerator {
    private static int nextAccountNumber = 1000;

    public static int generateAccountNumber(){
        return nextAccountNumber++;
    }
}
