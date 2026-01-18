public class q1{
    static class BankAccount{
        static String bankName = "HDFC";
        static int count;

        String accountHolderName;
        final int accountNumber;

        static int getTotalAccounts(){
            return count;
        }

        BankAccount(String accountHolderName, int accountNumber){
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;

            count ++;
        }
    }
    
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount("Taran", 1232);
        BankAccount b2 = new BankAccount("Taran", 1232);
        BankAccount b3 = new BankAccount("Taran", 1232);

        System.out.println(BankAccount.bankName);
        System.out.println(b1.accountHolderName);
        System.out.println(b1.accountNumber);

        System.out.println(BankAccount.getTotalAccounts());

        System.out.println(b1 instanceof BankAccount);
    }
}