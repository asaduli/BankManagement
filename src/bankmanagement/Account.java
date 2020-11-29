
package bankmanagement;

/**
 *
 * @author Asadul Islam
 */
public abstract  class Account  {
    
    int accountNumber;
    double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void showinfo();
        
    
    
}
