package NestedClass;

public class BankAccount {
    private double balanace = 10000;
    // Member Inner Class
    class Transaction{
        void withdraw(double amount) {
            if(amount <= balanace) {
                balanace -= amount;
                System.out.println("Withdraw: "+amount);
            } else {
                System.out.println("Insufficient Funds.");
            }
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        //  Syntax : Outer.Inner in_object = out_object.new Inner();
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println("Balance : "+account.balanace);
    }
}

/*
ℹ️ Points to Remember:
💫 Transaction belongs to specific account
💫 Direct access to private variable balance
💫 Clean encapsulation

*/